import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public abstract class Class73 {

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "Z")
	private boolean aBoolean440;

	@OriginalMember(owner = "client!dha", name = "f", descriptor = "Lclient!ml;")
	private Class5_Sub34_Sub1 aClass5_Sub34_Sub1_2;

	@OriginalMember(owner = "client!dha", name = "h", descriptor = "Z")
	private boolean aBoolean441;

	@OriginalMember(owner = "client!dha", name = "q", descriptor = "Ljava/lang/String;")
	private String aString62;

	@OriginalMember(owner = "client!dha", name = "t", descriptor = "Z")
	private boolean aBoolean442;

	@OriginalMember(owner = "client!dha", name = "x", descriptor = "Lclient!nr;")
	private Class5_Sub34_Sub2 aClass5_Sub34_Sub2_2;

	@OriginalMember(owner = "client!dha", name = "A", descriptor = "Z")
	private boolean aBoolean443;

	@OriginalMember(owner = "client!dha", name = "D", descriptor = "Lclient!rga;")
	private Class5_Sub34_Sub3 aClass5_Sub34_Sub3_2;

	@OriginalMember(owner = "client!dha", name = "C", descriptor = "[B")
	private final byte[] aByteArray61;

	@OriginalMember(owner = "client!dha", name = "z", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!dha", name = "s", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!dha", name = "B", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!dha", name = "o", descriptor = "Lclient!pl;")
	private final Class273 aClass273_22;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(I)V")
	protected Class73(@OriginalArg(0) int arg0) {
		if (!Static82.method1382("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray61 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass273_22 = new Class273(8);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)V")
	private void method5409() throws IOException {
		while (this.aClass5_Sub34_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class5_Sub34 local11 = this.method5425();
			if (local11 == null) {
				if (this.aBoolean443) {
					this.method5421();
				}
				return;
			}
			if (this.aClass5_Sub34_Sub2_2 == local11) {
				this.method5420();
			}
		}
		this.aClass5_Sub34_Sub3_2.method8631(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)Lclient!rga;")
	public final Class5_Sub34_Sub3 method5410() {
		return this.aClass5_Sub34_Sub3_2;
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(Z)Lclient!nr;")
	public final Class5_Sub34_Sub2 method5411() {
		return this.aClass5_Sub34_Sub2_2;
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(Z)V")
	public final void method5412() throws IOException {
		if (this.aBoolean441) {
			return;
		}
		while (!this.aBoolean442) {
			@Pc(22) Class5_Sub34 local22;
			if (this.aBoolean440) {
				local22 = (Class5_Sub34) this.aClass273_22.method6581((long) this.anOggPage2.getSerialNumber());
			} else {
				local22 = this.method5425();
				if (local22 == null) {
					if (this.aBoolean443) {
						this.method5421();
					}
					return;
				}
				if (local22 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean440 = true;
			}
			if (this.aClass5_Sub34_Sub1_2 == local22) {
				if (this.aClass5_Sub34_Sub1_2.method5205() >= 50) {
					return;
				}
				while (this.aClass5_Sub34_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass5_Sub34_Sub1_2.method8631(this.anOggPacket2);
					this.method5420();
					if (this.aClass5_Sub34_Sub3_2 != null) {
						@Pc(76) double local76 = this.aClass5_Sub34_Sub3_2.method7185();
						for (@Pc(78) int local78 = 0; local78 < 10 && this.method5418(); local78++) {
							this.method5409();
							if (this.aBoolean442) {
								return;
							}
						}
						if (this.aClass5_Sub34_Sub3_2.method7185() > local76) {
							return;
						}
					}
					if (this.aClass5_Sub34_Sub1_2.method5205() >= 50) {
						return;
					}
				}
			} else if (local22 instanceof Class5_Sub34_Sub2) {
				this.method5420();
			} else if (this.aClass5_Sub34_Sub3_2 != local22) {
				while (local22.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local22.anInt10097 == 1 && local22 instanceof Class5_Sub34_Sub2) {
						this.method5414(this.aString62);
					}
					local22.method8631(this.anOggPacket2);
				}
			} else if (this.aClass5_Sub34_Sub1_2 == null && !this.aBoolean441) {
				for (@Pc(142) int local142 = 0; local142 < 10 && this.method5418(); local142++) {
					this.method5409();
					if (this.aBoolean442) {
						return;
					}
				}
				return;
			}
			this.aBoolean440 = false;
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method5414(@OriginalArg(0) String arg0) {
		this.aString62 = arg0;
		if (this.aString62 == null) {
			this.aClass5_Sub34_Sub2_2 = null;
			return;
		}
		if (this.aClass5_Sub34_Sub2_2 != null && !this.aString62.equals(this.aClass5_Sub34_Sub2_2.method5611())) {
			this.aClass5_Sub34_Sub2_2 = null;
		}
		if (this.aClass5_Sub34_Sub2_2 != null) {
			return;
		}
		for (@Pc(42) Class5_Sub34 local42 = (Class5_Sub34) this.aClass273_22.method6577(); local42 != null; local42 = (Class5_Sub34) this.aClass273_22.method6589()) {
			if (local42 instanceof Class5_Sub34_Sub2) {
				@Pc(50) Class5_Sub34_Sub2 local50 = (Class5_Sub34_Sub2) local42;
				if (this.aString62.equals(local50.method5611())) {
					this.aClass5_Sub34_Sub2_2 = local50;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)Lclient!ml;")
	public final Class5_Sub34_Sub1 method5416() {
		return this.aClass5_Sub34_Sub1_2;
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(B)D")
	public final double method5417() {
		if (this.aClass5_Sub34_Sub1_2 == null) {
			return this.aClass5_Sub34_Sub3_2 == null ? 0.0D : this.aClass5_Sub34_Sub3_2.method7185();
		} else {
			return this.aClass5_Sub34_Sub1_2.method5203();
		}
	}

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "(B)Z")
	private boolean method5418() {
		if (this.aClass5_Sub34_Sub1_2 == null) {
			@Pc(17) double local17 = (double) this.aClass5_Sub34_Sub3_2.method7184();
			return local17 == 0.0D || (double) Static95.method1587() >= 1000.0D / local17 + (double) this.aClass5_Sub34_Sub3_2.method7182();
		} else {
			return !this.aClass5_Sub34_Sub3_2.method7183() || this.method5417() > this.aClass5_Sub34_Sub3_2.method7185();
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ZB)V")
	public final void method5419(@OriginalArg(0) boolean arg0) {
		if (this.aClass5_Sub34_Sub1_2 != null) {
			@Pc(11) Class5_Sub1_Sub3 local11 = this.aClass5_Sub34_Sub1_2.method5206();
			if (local11 != null) {
				local11.method7607(arg0);
			}
		}
		this.aBoolean441 = !this.aBoolean441;
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)V")
	private void method5420() {
		for (@Pc(18) Class5_Sub34 local18 = (Class5_Sub34) this.aClass273_22.method6577(); local18 != null; local18 = (Class5_Sub34) this.aClass273_22.method6589()) {
			if (local18 instanceof Class5_Sub34_Sub2) {
				@Pc(26) Class5_Sub34_Sub2 local26 = (Class5_Sub34_Sub2) local18;
				while ((local26.anInt10097 <= 8 || this.method5417() > (double) local26.method5612()) && local26.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local26.method8631(this.anOggPacket2);
				}
			}
		}
		this.method5414(this.aString62);
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)V")
	private void method5421() {
		for (@Pc(17) Class5_Sub34 local17 = (Class5_Sub34) this.aClass273_22.method6577(); local17 != null; local17 = (Class5_Sub34) this.aClass273_22.method6589()) {
			if (local17 != this.aClass5_Sub34_Sub3_2) {
				while (local17.anOggStreamState5.packetOut() == 1) {
					local17.method8631(this.anOggPacket2);
				}
			}
		}
		if (this.aClass5_Sub34_Sub3_2 == null) {
			return;
		}
		for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
			if (!this.method5418()) {
				return;
			}
			if (this.aClass5_Sub34_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method5423();
				return;
			}
			this.aClass5_Sub34_Sub3_2.method8631(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)Z")
	public final boolean method5422() {
		if (this.aBoolean442 || this.aBoolean443) {
			return this.aClass5_Sub34_Sub1_2 == null || this.aClass5_Sub34_Sub1_2.method5205() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "(Z)V")
	public final void method5423() {
		if (this.aBoolean442) {
			return;
		}
		for (@Pc(15) Class5_Sub34 local15 = (Class5_Sub34) this.aClass273_22.method6577(); local15 != null; local15 = (Class5_Sub34) this.aClass273_22.method6589()) {
			local15.method8632();
			local15.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!dha", name = "e", descriptor = "(I)Lclient!wt;")
	private Class5_Sub34 method5425() throws IOException {
		if (this.aBoolean442) {
			throw new IllegalStateException();
		} else if (this.aBoolean443) {
			return null;
		} else {
			@Pc(30) int local30;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local30 = this.method5426(this.aByteArray61);
				if (local30 == -1) {
					this.aBoolean443 = true;
					return null;
				}
				if (local30 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray61, local30)) {
					throw new RuntimeException("");
				}
			}
			local30 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(76) Class5_Sub34 local76 = (Class5_Sub34) this.aClass273_22.method6581((long) local30);
				if (!local76.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local76;
			}
			@Pc(93) OggStreamState local93 = new OggStreamState(local30);
			if (!local93.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local93.packetPeek(this.anOggPacket2) == 1) {
				@Pc(130) Class5_Sub34 local130;
				if (this.aClass5_Sub34_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass5_Sub34_Sub3_2 = new Class5_Sub34_Sub3(local93);
					local130 = this.aClass5_Sub34_Sub3_2;
				} else if (this.aClass5_Sub34_Sub1_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass5_Sub34_Sub1_2 = new Class5_Sub34_Sub1(local93);
					local130 = this.aClass5_Sub34_Sub1_2;
				} else {
					@Pc(154) byte[] local154 = this.anOggPacket2.getData();
					@Pc(158) StringBuffer local158 = new StringBuffer();
					for (@Pc(160) int local160 = 1; local154.length > local160 && Character.isLetterOrDigit((char) local154[local160]); local160++) {
						local158.append((char) local154[local160]);
					}
					@Pc(187) String local187 = local158.toString();
					if (local187.equals("kate")) {
						local130 = new Class5_Sub34_Sub2(local93);
					} else {
						local130 = new Class5_Sub34_Sub4(local93);
					}
				}
				this.aClass273_22.method6585((long) local30, local130);
				return local130;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I[B)I")
	protected abstract int method5426(@OriginalArg(1) byte[] arg0) throws IOException;
}
