import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public abstract class Class253 {

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "Z")
	private boolean aBoolean572;

	@OriginalMember(owner = "client!mo", name = "B", descriptor = "Z")
	private boolean aBoolean573;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "Z")
	private boolean aBoolean574;

	@OriginalMember(owner = "client!mo", name = "z", descriptor = "Lclient!oo;")
	private Class3_Sub32_Sub3 aClass3_Sub32_Sub3_2;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "Z")
	private boolean aBoolean575;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Lclient!uja;")
	private Class3_Sub32_Sub4 aClass3_Sub32_Sub4_2;

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "Ljava/lang/String;")
	private String aString109;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "Lclient!mu;")
	private Class3_Sub32_Sub2 aClass3_Sub32_Sub2_2;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "[B")
	private final byte[] aByteArray83;

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!mo", name = "w", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private OggPage anOggPage2;

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!mo", name = "A", descriptor = "Lclient!qn;")
	private final Class313 aClass313_42;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(I)V")
	protected Class253(@OriginalArg(0) int arg0) {
		if (!Static67.method1514("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray83 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass313_42 = new Class313(8);
	}

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "(I)V")
	public final void method7285() throws IOException {
		if (this.aBoolean575) {
			return;
		}
		while (!this.aBoolean573) {
			@Pc(33) Class3_Sub32 local33;
			if (this.aBoolean574) {
				local33 = (Class3_Sub32) this.aClass313_42.method7104((long) this.anOggPage2.getSerialNumber());
			} else {
				local33 = this.method7300();
				if (local33 == null) {
					if (this.aBoolean572) {
						this.method7294();
					}
					return;
				}
				if (local33 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean574 = true;
			}
			if (local33 == this.aClass3_Sub32_Sub2_2) {
				if (this.aClass3_Sub32_Sub2_2.method5616() >= 50) {
					return;
				}
				while (this.aClass3_Sub32_Sub2_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass3_Sub32_Sub2_2.method8589(this.anOggPacket2);
					this.method7289();
					if (this.aClass3_Sub32_Sub3_2 != null) {
						@Pc(188) double local188 = this.aClass3_Sub32_Sub3_2.method6451();
						for (@Pc(190) int local190 = 0; local190 < 10 && this.method7292(); local190++) {
							this.method7295();
							if (this.aBoolean573) {
								return;
							}
						}
						if (local188 < this.aClass3_Sub32_Sub3_2.method6451()) {
							return;
						}
					}
					if (this.aClass3_Sub32_Sub2_2.method5616() >= 50) {
						return;
					}
				}
			} else if (local33 instanceof Class3_Sub32_Sub4) {
				this.method7289();
			} else if (local33 != this.aClass3_Sub32_Sub3_2) {
				while (local33.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local33.anInt10068 == 1 && local33 instanceof Class3_Sub32_Sub4) {
						this.method7296(this.aString109);
					}
					local33.method8589(this.anOggPacket2);
				}
			} else if (this.aClass3_Sub32_Sub2_2 == null && !this.aBoolean575) {
				for (@Pc(98) int local98 = 0; local98 < 10 && this.method7292(); local98++) {
					this.method7295();
					if (this.aBoolean573) {
						return;
					}
				}
				return;
			}
			this.aBoolean574 = false;
		}
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)Lclient!oo;")
	public final Class3_Sub32_Sub3 method7286() {
		return this.aClass3_Sub32_Sub3_2;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)Z")
	public final boolean method7288() {
		if (this.aBoolean573 || this.aBoolean572) {
			return this.aClass3_Sub32_Sub2_2 == null || this.aClass3_Sub32_Sub2_2.method5616() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	private void method7289() {
		for (@Pc(19) Class3_Sub32 local19 = (Class3_Sub32) this.aClass313_42.method7103(); local19 != null; local19 = (Class3_Sub32) this.aClass313_42.method7110()) {
			if (local19 instanceof Class3_Sub32_Sub4) {
				@Pc(29) Class3_Sub32_Sub4 local29 = (Class3_Sub32_Sub4) local19;
				while ((local29.anInt10068 <= 8 || this.method7291() > (double) local29.method8596()) && local29.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local29.method8589(this.anOggPacket2);
				}
			}
		}
		this.method7296(this.aString109);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Lclient!uja;")
	public final Class3_Sub32_Sub4 method7290() {
		return this.aClass3_Sub32_Sub4_2;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)D")
	public final double method7291() {
		if (this.aClass3_Sub32_Sub2_2 == null) {
			return this.aClass3_Sub32_Sub3_2 == null ? 0.0D : this.aClass3_Sub32_Sub3_2.method6451();
		} else {
			return this.aClass3_Sub32_Sub2_2.method5618();
		}
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)Z")
	private boolean method7292() {
		if (this.aClass3_Sub32_Sub2_2 == null) {
			@Pc(44) double local44 = (double) this.aClass3_Sub32_Sub3_2.method6453();
			return local44 == 0.0D || (double) Static517.method6965() >= (double) this.aClass3_Sub32_Sub3_2.method6447() + 1000.0D / local44;
		} else {
			return !this.aClass3_Sub32_Sub3_2.method6449() || this.method7291() > this.aClass3_Sub32_Sub3_2.method6451();
		}
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)Lclient!mu;")
	public final Class3_Sub32_Sub2 method7293() {
		return this.aClass3_Sub32_Sub2_2;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V")
	private void method7294() {
		for (@Pc(7) Class3_Sub32 local7 = (Class3_Sub32) this.aClass313_42.method7103(); local7 != null; local7 = (Class3_Sub32) this.aClass313_42.method7110()) {
			if (this.aClass3_Sub32_Sub3_2 != local7) {
				while (local7.anOggStreamState5.packetOut() == 1) {
					local7.method8589(this.anOggPacket2);
				}
			}
		}
		if (false) {
			this.anOggPage2 = null;
		}
		if (this.aClass3_Sub32_Sub3_2 == null) {
			return;
		}
		for (@Pc(68) int local68 = 0; local68 < 10; local68++) {
			if (!this.method7292()) {
				return;
			}
			if (this.aClass3_Sub32_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method7298();
				return;
			}
			this.aClass3_Sub32_Sub3_2.method8589(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)V")
	private void method7295() throws IOException {
		while (this.aClass3_Sub32_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(13) Class3_Sub32 local13 = this.method7300();
			if (local13 == null) {
				if (this.aBoolean572) {
					this.method7294();
				}
				return;
			}
			if (local13 == this.aClass3_Sub32_Sub4_2) {
				this.method7289();
			}
		}
		this.aClass3_Sub32_Sub3_2.method8589(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method7296(@OriginalArg(0) String arg0) {
		this.aString109 = arg0;
		if (this.aString109 == null) {
			this.aClass3_Sub32_Sub4_2 = null;
			return;
		}
		if (this.aClass3_Sub32_Sub4_2 != null && !this.aString109.equals(this.aClass3_Sub32_Sub4_2.method8597())) {
			this.aClass3_Sub32_Sub4_2 = null;
		}
		if (this.aClass3_Sub32_Sub4_2 != null) {
			return;
		}
		for (@Pc(43) Class3_Sub32 local43 = (Class3_Sub32) this.aClass313_42.method7103(); local43 != null; local43 = (Class3_Sub32) this.aClass313_42.method7110()) {
			if (local43 instanceof Class3_Sub32_Sub4) {
				@Pc(53) Class3_Sub32_Sub4 local53 = (Class3_Sub32_Sub4) local43;
				if (this.aString109.equals(local53.method8597())) {
					this.aClass3_Sub32_Sub4_2 = local53;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public final void method7298() {
		if (this.aBoolean573) {
			return;
		}
		for (@Pc(25) Class3_Sub32 local25 = (Class3_Sub32) this.aClass313_42.method7103(); local25 != null; local25 = (Class3_Sub32) this.aClass313_42.method7110()) {
			local25.method8590();
			local25.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean573 = true;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BZ)V")
	public final void method7299(@OriginalArg(1) boolean arg0) {
		if (this.aClass3_Sub32_Sub2_2 != null) {
			@Pc(11) Class3_Sub33_Sub1 local11 = this.aClass3_Sub32_Sub2_2.method5620();
			if (local11 != null) {
				local11.method4817(arg0);
			}
		}
		this.aBoolean575 = !this.aBoolean575;
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)Lclient!qb;")
	private Class3_Sub32 method7300() throws IOException {
		if (this.aBoolean573) {
			throw new IllegalStateException();
		} else if (this.aBoolean572) {
			return null;
		} else {
			@Pc(27) int local27;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local27 = this.method7301(this.aByteArray83);
				if (local27 == -1) {
					this.aBoolean572 = true;
					return null;
				}
				if (local27 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray83, local27)) {
					throw new RuntimeException("");
				}
			}
			local27 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(223) Class3_Sub32 local223 = (Class3_Sub32) this.aClass313_42.method7104((long) local27);
				if (!local223.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local223;
			}
			@Pc(86) OggStreamState local86 = new OggStreamState(local27);
			if (!local86.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local86.packetPeek(this.anOggPacket2) == 1) {
				@Pc(138) Class3_Sub32 local138;
				if (this.aClass3_Sub32_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass3_Sub32_Sub3_2 = new Class3_Sub32_Sub3(local86);
					local138 = this.aClass3_Sub32_Sub3_2;
				} else if (this.aClass3_Sub32_Sub2_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass3_Sub32_Sub2_2 = new Class3_Sub32_Sub2(local86);
					local138 = this.aClass3_Sub32_Sub2_2;
				} else {
					@Pc(144) byte[] local144 = this.anOggPacket2.getData();
					@Pc(148) StringBuffer local148 = new StringBuffer();
					for (@Pc(150) int local150 = 1; local150 < local144.length && Character.isLetterOrDigit((char) local144[local150]); local150++) {
						local148.append((char) local144[local150]);
					}
					@Pc(175) String local175 = local148.toString();
					if (local175.equals("kate")) {
						local138 = new Class3_Sub32_Sub4(local86);
					} else {
						local138 = new Class3_Sub32_Sub1(local86);
					}
				}
				this.aClass313_42.method7107((long) local27, local138);
				return local138;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([BI)I")
	protected abstract int method7301(@OriginalArg(0) byte[] arg0) throws IOException;
}
