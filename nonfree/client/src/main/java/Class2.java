import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public abstract class Class2 {

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "Ljava/lang/String;")
	private String aString62;

	@OriginalMember(owner = "client!aaa", name = "o", descriptor = "Lclient!uea;")
	private Class8_Sub19_Sub4 aClass8_Sub19_Sub4_2;

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "Z")
	private boolean aBoolean384;

	@OriginalMember(owner = "client!aaa", name = "u", descriptor = "Lclient!ej;")
	private Class8_Sub19_Sub1 aClass8_Sub19_Sub1_2;

	@OriginalMember(owner = "client!aaa", name = "C", descriptor = "Z")
	private boolean aBoolean385;

	@OriginalMember(owner = "client!aaa", name = "H", descriptor = "Lclient!is;")
	private Class8_Sub19_Sub2 aClass8_Sub19_Sub2_2;

	@OriginalMember(owner = "client!aaa", name = "G", descriptor = "[B")
	private final byte[] aByteArray33;

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "Lclient!pfa;")
	private final Class253 aClass253_15;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(I)V")
	protected Class2(@OriginalArg(0) int arg0) {
		if (!Static267.method4634("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray33 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass253_15 = new Class253(8);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	private void method4218() {
		for (@Pc(18) Class8_Sub19 local18 = (Class8_Sub19) this.aClass253_15.method6593(); local18 != null; local18 = (Class8_Sub19) this.aClass253_15.method6595()) {
			if (local18 != this.aClass8_Sub19_Sub4_2) {
				while (local18.anOggStreamState5.packetOut() == 1) {
					local18.method7893(this.anOggPacket2);
				}
			}
		}
		if (this.aClass8_Sub19_Sub4_2 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
			if (!this.method4228()) {
				return;
			}
			if (this.aClass8_Sub19_Sub4_2.anOggStreamState5.packetOut() != 1) {
				this.method4234();
				return;
			}
			this.aClass8_Sub19_Sub4_2.method7893(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)Lclient!ma;")
	private Class8_Sub19 method4219() throws IOException {
		if (this.aBoolean385) {
			throw new IllegalStateException();
		} else if (this.aBoolean384) {
			return null;
		} else {
			@Pc(23) int local23;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local23 = this.method4233(this.aByteArray33);
				if (local23 == -1) {
					this.aBoolean384 = true;
					return null;
				}
				if (local23 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray33, local23)) {
					throw new RuntimeException("");
				}
			}
			local23 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(81) Class8_Sub19 local81 = (Class8_Sub19) this.aClass253_15.method6594((long) local23);
				if (!local81.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local81;
			}
			@Pc(98) OggStreamState local98 = new OggStreamState(local23);
			if (!local98.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local98.packetPeek(this.anOggPacket2) == 1) {
				@Pc(135) Class8_Sub19 local135;
				if (this.aClass8_Sub19_Sub4_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass8_Sub19_Sub4_2 = new Class8_Sub19_Sub4(local98);
					local135 = this.aClass8_Sub19_Sub4_2;
				} else if (this.aClass8_Sub19_Sub1_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass8_Sub19_Sub1_2 = new Class8_Sub19_Sub1(local98);
					local135 = this.aClass8_Sub19_Sub1_2;
				} else {
					@Pc(148) byte[] local148 = this.anOggPacket2.getData();
					@Pc(152) StringBuffer local152 = new StringBuffer();
					for (@Pc(154) int local154 = 1; local154 < local148.length && Character.isLetterOrDigit((char) local148[local154]); local154++) {
						local152.append((char) local148[local154]);
					}
					@Pc(181) String local181 = local152.toString();
					if (local181.equals("kate")) {
						local135 = new Class8_Sub19_Sub2(local98);
					} else {
						local135 = new Class8_Sub19_Sub3(local98);
					}
				}
				this.aClass253_15.method6591(local135, (long) local23);
				return local135;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)Z")
	public final boolean method4222() {
		if (this.aBoolean385 || this.aBoolean384) {
			return this.aClass8_Sub19_Sub1_2 == null || this.aClass8_Sub19_Sub1_2.method2841() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V")
	public final void method4223() throws IOException {
		if (this.aBoolean382) {
			return;
		}
		while (!this.aBoolean385) {
			@Pc(24) Class8_Sub19 local24;
			if (this.aBoolean383) {
				local24 = (Class8_Sub19) this.aClass253_15.method6594((long) this.anOggPage2.getSerialNumber());
			} else {
				local24 = this.method4219();
				if (local24 == null) {
					if (this.aBoolean384) {
						this.method4218();
					}
					return;
				}
				if (local24 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean383 = true;
			}
			if (this.aClass8_Sub19_Sub1_2 == local24) {
				if (this.aClass8_Sub19_Sub1_2.method2841() >= 50) {
					return;
				}
				while (this.aClass8_Sub19_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass8_Sub19_Sub1_2.method7893(this.anOggPacket2);
					this.method4224();
					if (this.aClass8_Sub19_Sub4_2 != null) {
						@Pc(82) double local82 = this.aClass8_Sub19_Sub4_2.method7903();
						for (@Pc(84) int local84 = 0; local84 < 10 && this.method4228(); local84++) {
							this.method4231();
							if (this.aBoolean385) {
								return;
							}
						}
						if (this.aClass8_Sub19_Sub4_2.method7903() > local82) {
							return;
						}
					}
					if (this.aClass8_Sub19_Sub1_2.method2841() >= 50) {
						return;
					}
				}
			} else if (local24 instanceof Class8_Sub19_Sub2) {
				this.method4224();
			} else if (local24 != this.aClass8_Sub19_Sub4_2) {
				while (local24.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local24.anInt9770 == 1 && local24 instanceof Class8_Sub19_Sub2) {
						this.method4229(this.aString62);
					}
					local24.method7893(this.anOggPacket2);
				}
			} else if (this.aClass8_Sub19_Sub1_2 == null && !this.aBoolean382) {
				for (@Pc(175) int local175 = 0; local175 < 10 && this.method4228(); local175++) {
					this.method4231();
					if (this.aBoolean385) {
						return;
					}
				}
				return;
			}
			this.aBoolean383 = false;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)V")
	private void method4224() {
		for (@Pc(11) Class8_Sub19 local11 = (Class8_Sub19) this.aClass253_15.method6593(); local11 != null; local11 = (Class8_Sub19) this.aClass253_15.method6595()) {
			if (local11 instanceof Class8_Sub19_Sub2) {
				@Pc(19) Class8_Sub19_Sub2 local19 = (Class8_Sub19_Sub2) local11;
				while ((local19.anInt9770 <= 8 || this.method4226() > (double) local19.method4357()) && local19.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local19.method7893(this.anOggPacket2);
				}
			}
		}
		this.method4229(this.aString62);
	}

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(I)Lclient!ej;")
	public final Class8_Sub19_Sub1 method4225() {
		return this.aClass8_Sub19_Sub1_2;
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)D")
	public final double method4226() {
		if (this.aClass8_Sub19_Sub1_2 == null) {
			return this.aClass8_Sub19_Sub4_2 == null ? 0.0D : this.aClass8_Sub19_Sub4_2.method7903();
		} else {
			return this.aClass8_Sub19_Sub1_2.method2844();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V")
	public final void method4227(@OriginalArg(0) boolean arg0) {
		if (this.aClass8_Sub19_Sub1_2 != null) {
			@Pc(16) Class8_Sub16_Sub2 local16 = this.aClass8_Sub19_Sub1_2.method2845();
			if (local16 != null) {
				local16.method3688(arg0);
			}
		}
		this.aBoolean382 = !this.aBoolean382;
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)Z")
	private boolean method4228() {
		if (this.aClass8_Sub19_Sub1_2 == null) {
			@Pc(38) double local38 = (double) this.aClass8_Sub19_Sub4_2.method7900();
			return local38 == 0.0D || (double) Static342.method5463() >= (double) this.aClass8_Sub19_Sub4_2.method7897() + 1000.0D / local38;
		} else {
			return !this.aClass8_Sub19_Sub4_2.method7898() || this.method4226() > this.aClass8_Sub19_Sub4_2.method7903();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4229(@OriginalArg(0) String arg0) {
		this.aString62 = arg0;
		if (this.aString62 == null) {
			this.aClass8_Sub19_Sub2_2 = null;
			return;
		}
		if (this.aClass8_Sub19_Sub2_2 != null && !this.aString62.equals(this.aClass8_Sub19_Sub2_2.method4355())) {
			this.aClass8_Sub19_Sub2_2 = null;
		}
		if (this.aClass8_Sub19_Sub2_2 != null) {
			return;
		}
		for (@Pc(46) Class8_Sub19 local46 = (Class8_Sub19) this.aClass253_15.method6593(); local46 != null; local46 = (Class8_Sub19) this.aClass253_15.method6595()) {
			if (local46 instanceof Class8_Sub19_Sub2) {
				@Pc(54) Class8_Sub19_Sub2 local54 = (Class8_Sub19_Sub2) local46;
				if (this.aString62.equals(local54.method4355())) {
					this.aClass8_Sub19_Sub2_2 = local54;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(Z)Lclient!uea;")
	public final Class8_Sub19_Sub4 method4230() {
		return this.aClass8_Sub19_Sub4_2;
	}

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "(I)V")
	private void method4231() throws IOException {
		while (this.aClass8_Sub19_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(13) Class8_Sub19 local13 = this.method4219();
			if (local13 == null) {
				if (this.aBoolean384) {
					this.method4218();
				}
				return;
			}
			if (local13 == this.aClass8_Sub19_Sub2_2) {
				this.method4224();
			}
		}
		this.aClass8_Sub19_Sub4_2.method7893(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(B)Lclient!is;")
	public final Class8_Sub19_Sub2 method4232() {
		return this.aClass8_Sub19_Sub2_2;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "([BB)I")
	protected abstract int method4233(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "(I)V")
	public final void method4234() {
		if (this.aBoolean385) {
			return;
		}
		for (@Pc(15) Class8_Sub19 local15 = (Class8_Sub19) this.aClass253_15.method6593(); local15 != null; local15 = (Class8_Sub19) this.aClass253_15.method6595()) {
			local15.method7896();
			local15.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean385 = true;
	}
}
