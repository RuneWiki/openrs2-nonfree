import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public abstract class Class62 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!wda;")
	private Class6_Sub13_Sub4 aClass6_Sub13_Sub4_2;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Ljava/lang/String;")
	private String aString19;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!cga;")
	private Class6_Sub13_Sub1 aClass6_Sub13_Sub1_2;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "Lclient!sb;")
	private Class6_Sub13_Sub3 aClass6_Sub13_Sub3_2;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "[B")
	private final byte[] aByteArray14;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Lclient!wr;")
	private final Class380 aClass380_6;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	protected Class62(@OriginalArg(0) int arg0) {
		if (!Static362.method5843("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray14 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass380_6 = new Class380(8);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[B)I")
	protected abstract int method2403(@OriginalArg(1) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!cga;")
	public final Class6_Sub13_Sub1 method2404() {
		return this.aClass6_Sub13_Sub1_2;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)D")
	public final double method2405() {
		if (this.aClass6_Sub13_Sub1_2 == null) {
			return this.aClass6_Sub13_Sub3_2 == null ? 0.0D : this.aClass6_Sub13_Sub3_2.method7341();
		} else {
			return this.aClass6_Sub13_Sub1_2.method2043();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Z")
	public final boolean method2406() {
		if (this.aBoolean232 || this.aBoolean230) {
			return this.aClass6_Sub13_Sub1_2 == null || this.aClass6_Sub13_Sub1_2.method2046() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public final void method2407() {
		if (this.aBoolean232) {
			return;
		}
		for (@Pc(19) Class6_Sub13 local19 = (Class6_Sub13) this.aClass380_6.method8755(); local19 != null; local19 = (Class6_Sub13) this.aClass380_6.method8752()) {
			local19.method8553();
			local19.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean232 = true;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
	public final void method2408() throws IOException {
		if (this.aBoolean231) {
			return;
		}
		while (!this.aBoolean232) {
			@Pc(20) Class6_Sub13 local20;
			if (this.aBoolean229) {
				local20 = (Class6_Sub13) this.aClass380_6.method8747((long) this.anOggPage2.getSerialNumber());
			} else {
				local20 = this.method2418();
				if (local20 == null) {
					if (this.aBoolean230) {
						this.method2411();
					}
					return;
				}
				if (local20 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean229 = true;
			}
			if (this.aClass6_Sub13_Sub1_2 == local20) {
				if (this.aClass6_Sub13_Sub1_2.method2046() >= 50) {
					return;
				}
				while (this.aClass6_Sub13_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass6_Sub13_Sub1_2.method8552(this.anOggPacket2);
					this.method2414();
					if (this.aClass6_Sub13_Sub3_2 != null) {
						@Pc(80) double local80 = this.aClass6_Sub13_Sub3_2.method7341();
						for (@Pc(82) int local82 = 0; local82 < 10 && this.method2416(); local82++) {
							this.method2409();
							if (this.aBoolean232) {
								return;
							}
						}
						if (this.aClass6_Sub13_Sub3_2.method7341() > local80) {
							return;
						}
					}
					if (this.aClass6_Sub13_Sub1_2.method2046() >= 50) {
						return;
					}
				}
			} else if (local20 instanceof Class6_Sub13_Sub4) {
				this.method2414();
			} else if (this.aClass6_Sub13_Sub3_2 != local20) {
				while (local20.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local20.anInt10513 == 1 && local20 instanceof Class6_Sub13_Sub4) {
						this.method2413(this.aString19);
					}
					local20.method8552(this.anOggPacket2);
				}
			} else if (this.aClass6_Sub13_Sub1_2 == null && !this.aBoolean231) {
				for (@Pc(179) int local179 = 0; local179 < 10 && this.method2416(); local179++) {
					this.method2409();
					if (this.aBoolean232) {
						return;
					}
				}
				return;
			}
			this.aBoolean229 = false;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	private void method2409() throws IOException {
		while (this.aClass6_Sub13_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class6_Sub13 local11 = this.method2418();
			if (local11 == null) {
				if (this.aBoolean230) {
					this.method2411();
				}
				return;
			}
			if (local11 == this.aClass6_Sub13_Sub4_2) {
				this.method2414();
			}
		}
		this.aClass6_Sub13_Sub3_2.method8552(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
	private void method2411() {
		for (@Pc(7) Class6_Sub13 local7 = (Class6_Sub13) this.aClass380_6.method8755(); local7 != null; local7 = (Class6_Sub13) this.aClass380_6.method8752()) {
			if (local7 != this.aClass6_Sub13_Sub3_2) {
				while (local7.anOggStreamState5.packetOut() == 1) {
					local7.method8552(this.anOggPacket2);
				}
			}
		}
		if (this.aClass6_Sub13_Sub3_2 == null) {
			return;
		}
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (!this.method2416()) {
				return;
			}
			if (this.aClass6_Sub13_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method2407();
				return;
			}
			this.aClass6_Sub13_Sub3_2.method8552(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)Lclient!sb;")
	public final Class6_Sub13_Sub3 method2412() {
		return this.aClass6_Sub13_Sub3_2;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method2413(@OriginalArg(1) String arg0) {
		this.aString19 = arg0;
		if (this.aString19 == null) {
			this.aClass6_Sub13_Sub4_2 = null;
			return;
		}
		if (this.aClass6_Sub13_Sub4_2 != null && !this.aString19.equals(this.aClass6_Sub13_Sub4_2.method8558())) {
			this.aClass6_Sub13_Sub4_2 = null;
		}
		if (this.aClass6_Sub13_Sub4_2 != null) {
			return;
		}
		for (@Pc(44) Class6_Sub13 local44 = (Class6_Sub13) this.aClass380_6.method8755(); local44 != null; local44 = (Class6_Sub13) this.aClass380_6.method8752()) {
			if (local44 instanceof Class6_Sub13_Sub4) {
				@Pc(52) Class6_Sub13_Sub4 local52 = (Class6_Sub13_Sub4) local44;
				if (this.aString19.equals(local52.method8558())) {
					this.aClass6_Sub13_Sub4_2 = local52;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
	private void method2414() {
		for (@Pc(7) Class6_Sub13 local7 = (Class6_Sub13) this.aClass380_6.method8755(); local7 != null; local7 = (Class6_Sub13) this.aClass380_6.method8752()) {
			if (local7 instanceof Class6_Sub13_Sub4) {
				@Pc(15) Class6_Sub13_Sub4 local15 = (Class6_Sub13_Sub4) local7;
				while ((local15.anInt10513 <= 8 || this.method2405() > (double) local15.method8560()) && local15.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local15.method8552(this.anOggPacket2);
				}
			}
		}
		this.method2413(this.aString19);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
	public final void method2415(@OriginalArg(0) boolean arg0) {
		if (this.aClass6_Sub13_Sub1_2 != null) {
			@Pc(7) Class6_Sub4_Sub4 local7 = this.aClass6_Sub13_Sub1_2.method2042();
			if (local7 != null) {
				local7.method8518(arg0);
			}
		}
		this.aBoolean231 = !this.aBoolean231;
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)Z")
	private boolean method2416() {
		if (this.aClass6_Sub13_Sub1_2 == null) {
			@Pc(19) double local19 = (double) this.aClass6_Sub13_Sub3_2.method7335();
			return local19 == 0.0D || (double) Static582.method8056() >= (double) this.aClass6_Sub13_Sub3_2.method7339() + 1000.0D / local19;
		} else {
			return !this.aClass6_Sub13_Sub3_2.method7337() || this.method2405() > this.aClass6_Sub13_Sub3_2.method7341();
		}
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)Lclient!wda;")
	public final Class6_Sub13_Sub4 method2417() {
		return this.aClass6_Sub13_Sub4_2;
	}

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)Lclient!rd;")
	private Class6_Sub13 method2418() throws IOException {
		if (this.aBoolean232) {
			throw new IllegalStateException();
		} else if (this.aBoolean230) {
			return null;
		} else {
			@Pc(32) int local32;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local32 = this.method2403(this.aByteArray14);
				if (local32 == -1) {
					this.aBoolean230 = true;
					return null;
				}
				if (local32 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray14, local32)) {
					throw new RuntimeException("");
				}
			}
			local32 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(84) Class6_Sub13 local84 = (Class6_Sub13) this.aClass380_6.method8747((long) local32);
				if (!local84.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local84;
			}
			@Pc(101) OggStreamState local101 = new OggStreamState(local32);
			if (!local101.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local101.packetPeek(this.anOggPacket2) == 1) {
				@Pc(182) Class6_Sub13 local182;
				if (this.aClass6_Sub13_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass6_Sub13_Sub3_2 = new Class6_Sub13_Sub3(local101);
					local182 = this.aClass6_Sub13_Sub3_2;
				} else if (this.aClass6_Sub13_Sub1_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass6_Sub13_Sub1_2 = new Class6_Sub13_Sub1(local101);
					local182 = this.aClass6_Sub13_Sub1_2;
				} else {
					@Pc(140) byte[] local140 = this.anOggPacket2.getData();
					@Pc(144) StringBuffer local144 = new StringBuffer();
					for (@Pc(146) int local146 = 1; local146 < local140.length && Character.isLetterOrDigit((char) local140[local146]); local146++) {
						local144.append((char) local140[local146]);
					}
					@Pc(173) String local173 = local144.toString();
					if (local173.equals("kate")) {
						local182 = new Class6_Sub13_Sub4(local101);
					} else {
						local182 = new Class6_Sub13_Sub2(local101);
					}
				}
				this.aClass380_6.method8753(local182, (long) local32);
				return local182;
			} else {
				throw new IllegalStateException();
			}
		}
	}
}
