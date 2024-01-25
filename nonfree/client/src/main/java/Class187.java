import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public abstract class Class187 {

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Z")
	private boolean aBoolean593;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Lclient!ce;")
	private Class3_Sub10_Sub2 aClass3_Sub10_Sub2_2;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "Z")
	private boolean aBoolean594;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Ljava/lang/String;")
	private String aString73;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Z")
	private boolean aBoolean595;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "Lclient!bi;")
	private Class3_Sub10_Sub1 aClass3_Sub10_Sub1_2;

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "Lclient!qea;")
	private Class3_Sub10_Sub4 aClass3_Sub10_Sub4_2;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "Z")
	private boolean aBoolean596;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "[B")
	private final byte[] aByteArray71;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "Lclient!sga;")
	private final Class307 aClass307_33;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V")
	protected Class187(@OriginalArg(0) int arg0) {
		if (!Static30.method575("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray71 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass307_33 = new Class307(8);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	private void method5762() {
		for (@Pc(11) Class3_Sub10 local11 = (Class3_Sub10) this.aClass307_33.method7421(); local11 != null; local11 = (Class3_Sub10) this.aClass307_33.method7428()) {
			if (local11 != this.aClass3_Sub10_Sub2_2) {
				while (local11.anOggStreamState5.packetOut() == 1) {
					local11.method6829(this.anOggPacket2);
				}
			}
		}
		if (this.aClass3_Sub10_Sub2_2 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
			if (!this.method5777()) {
				return;
			}
			if (this.aClass3_Sub10_Sub2_2.anOggStreamState5.packetOut() != 1) {
				this.method5771();
				return;
			}
			this.aClass3_Sub10_Sub2_2.method6829(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method5763(@OriginalArg(0) String arg0) {
		this.aString73 = arg0;
		if (this.aString73 == null) {
			this.aClass3_Sub10_Sub1_2 = null;
			return;
		}
		if (this.aClass3_Sub10_Sub1_2 != null && !this.aString73.equals(this.aClass3_Sub10_Sub1_2.method775())) {
			this.aClass3_Sub10_Sub1_2 = null;
		}
		if (this.aClass3_Sub10_Sub1_2 != null) {
			return;
		}
		for (@Pc(46) Class3_Sub10 local46 = (Class3_Sub10) this.aClass307_33.method7421(); local46 != null; local46 = (Class3_Sub10) this.aClass307_33.method7428()) {
			if (local46 instanceof Class3_Sub10_Sub1) {
				@Pc(54) Class3_Sub10_Sub1 local54 = (Class3_Sub10_Sub1) local46;
				if (this.aString73.equals(local54.method775())) {
					this.aClass3_Sub10_Sub1_2 = local54;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	private void method5764() {
		for (@Pc(7) Class3_Sub10 local7 = (Class3_Sub10) this.aClass307_33.method7421(); local7 != null; local7 = (Class3_Sub10) this.aClass307_33.method7428()) {
			if (local7 instanceof Class3_Sub10_Sub1) {
				@Pc(15) Class3_Sub10_Sub1 local15 = (Class3_Sub10_Sub1) local7;
				while ((local15.anInt8214 <= 8 || this.method5775() > (double) local15.method777()) && local15.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local15.method6829(this.anOggPacket2);
				}
			}
		}
		this.method5763(this.aString73);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Z")
	public final boolean method5765() {
		if (this.aBoolean593 || this.aBoolean595) {
			return this.aClass3_Sub10_Sub4_2 == null || this.aClass3_Sub10_Sub4_2.method6834() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
	private void method5766() throws IOException {
		while (this.aClass3_Sub10_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class3_Sub10 local11 = this.method5770();
			if (local11 == null) {
				if (this.aBoolean595) {
					this.method5762();
				}
				return;
			}
			if (local11 == this.aClass3_Sub10_Sub1_2) {
				this.method5764();
			}
		}
		this.aClass3_Sub10_Sub2_2.method6829(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)Lclient!ce;")
	public final Class3_Sub10_Sub2 method5768() {
		return this.aClass3_Sub10_Sub2_2;
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V")
	public final void method5769() throws IOException {
		if (this.aBoolean594) {
			return;
		}
		while (!this.aBoolean593) {
			@Pc(28) Class3_Sub10 local28;
			if (this.aBoolean596) {
				local28 = (Class3_Sub10) this.aClass307_33.method7424((long) this.anOggPage2.getSerialNumber());
			} else {
				local28 = this.method5770();
				if (local28 == null) {
					if (this.aBoolean595) {
						this.method5762();
					}
					return;
				}
				if (local28 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean596 = true;
			}
			if (this.aClass3_Sub10_Sub4_2 == local28) {
				if (this.aClass3_Sub10_Sub4_2.method6834() >= 50) {
					return;
				}
				while (this.aClass3_Sub10_Sub4_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub10_Sub4_2.method6829(this.anOggPacket2);
					this.method5764();
					if (this.aClass3_Sub10_Sub2_2 != null) {
						@Pc(150) double local150 = this.aClass3_Sub10_Sub2_2.method1311();
						for (@Pc(152) int local152 = 0; local152 < 10 && this.method5777(); local152++) {
							this.method5766();
							if (this.aBoolean593) {
								return;
							}
						}
						if (this.aClass3_Sub10_Sub2_2.method1311() > local150) {
							return;
						}
					}
					if (this.aClass3_Sub10_Sub4_2.method6834() >= 50) {
						return;
					}
				}
			} else if (local28 instanceof Class3_Sub10_Sub1) {
				this.method5764();
			} else if (this.aClass3_Sub10_Sub2_2 != local28) {
				while (local28.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local28.anInt8214 == 1 && local28 instanceof Class3_Sub10_Sub1) {
						this.method5763(this.aString73);
					}
					local28.method6829(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub10_Sub4_2 == null && !this.aBoolean594) {
				for (@Pc(101) int local101 = 0; local101 < 10 && this.method5777(); local101++) {
					this.method5766();
					if (this.aBoolean593) {
						return;
					}
				}
				return;
			}
			this.aBoolean596 = false;
		}
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)Lclient!oga;")
	private Class3_Sub10 method5770() throws IOException {
		if (this.aBoolean593) {
			throw new IllegalStateException();
		} else if (this.aBoolean595) {
			return null;
		} else {
			@Pc(28) int local28;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local28 = this.method5776(this.aByteArray71);
				if (local28 == -1) {
					this.aBoolean595 = true;
					return null;
				}
				if (local28 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray71, local28)) {
					throw new RuntimeException("");
				}
			}
			local28 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(192) Class3_Sub10 local192 = (Class3_Sub10) this.aClass307_33.method7424((long) local28);
				if (!local192.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local192;
			}
			@Pc(71) OggStreamState local71 = new OggStreamState(local28);
			if (!local71.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local71.packetPeek(this.anOggPacket2) == 1) {
				@Pc(146) Class3_Sub10 local146;
				if (this.aClass3_Sub10_Sub2_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub10_Sub2_2 = new Class3_Sub10_Sub2(local71);
					local146 = this.aClass3_Sub10_Sub2_2;
				} else if (this.aClass3_Sub10_Sub4_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub10_Sub4_2 = new Class3_Sub10_Sub4(local71);
					local146 = this.aClass3_Sub10_Sub4_2;
				} else {
					@Pc(108) byte[] local108 = this.anOggPacket2.getData();
					@Pc(112) StringBuffer local112 = new StringBuffer();
					for (@Pc(114) int local114 = 1; local108.length > local114 && Character.isLetterOrDigit((char) local108[local114]); local114++) {
						local112.append((char) local108[local114]);
					}
					@Pc(137) String local137 = local112.toString();
					if (local137.equals("kate")) {
						local146 = new Class3_Sub10_Sub1(local71);
					} else {
						local146 = new Class3_Sub10_Sub3(local71);
					}
				}
				this.aClass307_33.method7425((long) local28, local146);
				return local146;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "(I)V")
	public final void method5771() {
		if (this.aBoolean593) {
			return;
		}
		for (@Pc(15) Class3_Sub10 local15 = (Class3_Sub10) this.aClass307_33.method7421(); local15 != null; local15 = (Class3_Sub10) this.aClass307_33.method7428()) {
			local15.method6830();
			local15.anOggStreamState5.b();
		}
		this.anOggPacket2.b();
		this.anOggPage2.b();
		this.anOggSyncState2.b();
		this.aBoolean593 = true;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZB)V")
	public final void method5772(@OriginalArg(0) boolean arg0) {
		if (this.aClass3_Sub10_Sub4_2 != null) {
			@Pc(11) Class3_Sub7_Sub2 local11 = this.aClass3_Sub10_Sub4_2.method6839();
			if (local11 != null) {
				local11.method1335(arg0);
			}
		}
		this.aBoolean594 = !this.aBoolean594;
	}

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "(I)Lclient!bi;")
	public final Class3_Sub10_Sub1 method5773() {
		return this.aClass3_Sub10_Sub1_2;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)D")
	public final double method5775() {
		if (this.aClass3_Sub10_Sub4_2 == null) {
			return this.aClass3_Sub10_Sub2_2 == null ? 0.0D : this.aClass3_Sub10_Sub2_2.method1311();
		} else {
			return this.aClass3_Sub10_Sub4_2.method6835();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([BB)I")
	protected abstract int method5776(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "(I)Z")
	private boolean method5777() {
		if (this.aClass3_Sub10_Sub4_2 == null) {
			@Pc(38) double local38 = (double) this.aClass3_Sub10_Sub2_2.method1305();
			return local38 == 0.0D || (double) Static444.method6719() >= (double) this.aClass3_Sub10_Sub2_2.method1308() + 1000.0D / local38;
		} else {
			return !this.aClass3_Sub10_Sub2_2.method1307() || this.method5775() > this.aClass3_Sub10_Sub2_2.method1311();
		}
	}

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "(I)Lclient!qea;")
	public final Class3_Sub10_Sub4 method5778() {
		return this.aClass3_Sub10_Sub4_2;
	}
}
