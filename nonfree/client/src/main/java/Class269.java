import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class269 {

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!mj;")
	private Class159 aClass159_4 = null;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	private int anInt7760 = 65000;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Lclient!mj;")
	private Class159 aClass159_5 = null;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
	private final int anInt7764;

	static {
		new Class21("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(ILclient!mj;Lclient!mj;I)V")
	public Class269(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) int arg3) {
		this.anInt7760 = arg3;
		this.anInt7764 = arg0;
		this.aClass159_4 = arg1;
		this.aClass159_5 = arg2;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[BIB)Z")
	public boolean method6180(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class159 local6 = this.aClass159_4;
		synchronized (this.aClass159_4) {
			if (arg2 < 0 || arg2 > this.anInt7760) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method6181(arg2, arg1, arg0, true);
			if (!local33) {
				local33 = this.method6181(arg2, arg1, arg0, false);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[BIZB)Z")
	private boolean method6181(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class159 local8 = this.aClass159_4;
		synchronized (this.aClass159_4) {
			try {
				@Pc(73) int local73;
				if (arg3) {
					if (this.aClass159_5.method4063() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass159_5.method4067((long) (arg2 * 6));
					this.aClass159_5.method4068(0, Static459.aByteArray93, 6);
					local73 = ((Static459.aByteArray93[4] & 0xFF) << 8) + ((Static459.aByteArray93[3] & 0xFF) << 16) + (Static459.aByteArray93[5] & 0xFF);
					if (local73 <= 0 || (long) local73 > this.aClass159_4.method4063() / 520L) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass159_4.method4063() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static459.aByteArray93[2] = (byte) arg0;
				Static459.aByteArray93[3] = (byte) (local73 >> 16);
				Static459.aByteArray93[5] = (byte) local73;
				Static459.aByteArray93[0] = (byte) (arg0 >> 16);
				Static459.aByteArray93[4] = (byte) (local73 >> 8);
				Static459.aByteArray93[1] = (byte) (arg0 >> 8);
				this.aClass159_5.method4067((long) (arg2 * 6));
				this.aClass159_5.method4066(0, 6, Static459.aByteArray93);
				@Pc(166) int local166 = 0;
				@Pc(168) int local168 = 0;
				while (arg0 > local166) {
					@Pc(172) int local172 = 0;
					@Pc(207) int local207;
					if (arg3) {
						this.aClass159_4.method4067((long) (local73 * 520));
						try {
							this.aClass159_4.method4068(0, Static459.aByteArray93, 8);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local207 = ((Static459.aByteArray93[0] & 0xFF) << 8) + (Static459.aByteArray93[1] & 0xFF);
						@Pc(221) int local221 = (Static459.aByteArray93[3] & 0xFF) + ((Static459.aByteArray93[2] & 0xFF) << 8);
						local172 = ((Static459.aByteArray93[5] & 0xFF) << 8) + ((Static459.aByteArray93[4] & 0xFF) << 16) + (Static459.aByteArray93[6] & 0xFF);
						@Pc(250) int local250 = Static459.aByteArray93[7] & 0xFF;
						if (arg2 != local207 || local221 != local168 || local250 != this.anInt7764) {
							return false;
						}
						if (local172 < 0 || (long) local172 > this.aClass159_4.method4063() / 520L) {
							return false;
						}
					}
					if (local172 == 0) {
						local172 = (int) ((this.aClass159_4.method4063() + 519L) / 520L);
						arg3 = false;
						if (local172 == 0) {
							local172++;
						}
						if (local73 == local172) {
							local172++;
						}
					}
					if (arg0 - local166 <= 512) {
						local172 = 0;
					}
					Static459.aByteArray93[1] = (byte) arg2;
					Static459.aByteArray93[2] = (byte) (local168 >> 8);
					Static459.aByteArray93[3] = (byte) local168;
					Static459.aByteArray93[0] = (byte) (arg2 >> 8);
					Static459.aByteArray93[7] = (byte) this.anInt7764;
					Static459.aByteArray93[5] = (byte) (local172 >> 8);
					Static459.aByteArray93[4] = (byte) (local172 >> 16);
					Static459.aByteArray93[6] = (byte) local172;
					this.aClass159_4.method4067((long) (local73 * 520));
					this.aClass159_4.method4066(0, 8, Static459.aByteArray93);
					local207 = arg0 - local166;
					if (local207 > 512) {
						local207 = 512;
					}
					this.aClass159_4.method4066(local166, local207, arg1);
					local166 += local207;
					local73 = local172;
					local168++;
				}
				return true;
			} catch (@Pc(426) IOException local426) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7764;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[B")
	public byte[] method6182(@OriginalArg(1) int arg0) {
		@Pc(8) Class159 local8 = this.aClass159_4;
		synchronized (this.aClass159_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass159_5.method4063()) {
					return null;
				}
				this.aClass159_5.method4067((long) (arg0 * 6));
				this.aClass159_5.method4068(0, Static459.aByteArray93, 6);
				@Pc(69) int local69 = (Static459.aByteArray93[2] & 0xFF) + ((Static459.aByteArray93[1] & 0xFF) << 8) + ((Static459.aByteArray93[0] & 0xFF) << 16);
				@Pc(93) int local93 = ((Static459.aByteArray93[3] & 0xFF) << 16) - (-((Static459.aByteArray93[4] & 0xFF) << 8) - (Static459.aByteArray93[5] & 0xFF));
				if (local69 < 0 || local69 > this.anInt7760) {
					return null;
				} else if (local93 > 0 && (long) local93 <= this.aClass159_4.method4063() / 520L) {
					@Pc(126) byte[] local126 = new byte[local69];
					@Pc(128) int local128 = 0;
					@Pc(139) int local139 = 0;
					while (local69 > local128) {
						if (local93 == 0) {
							return null;
						}
						this.aClass159_4.method4067((long) (local93 * 520));
						@Pc(167) int local167 = local69 - local128;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass159_4.method4068(0, Static459.aByteArray93, local167 + 8);
						@Pc(195) int local195 = (Static459.aByteArray93[1] & 0xFF) + ((Static459.aByteArray93[0] & 0xFF) << 8);
						@Pc(210) int local210 = ((Static459.aByteArray93[2] & 0xFF) << 8) + (Static459.aByteArray93[3] & 0xFF);
						@Pc(233) int local233 = ((Static459.aByteArray93[4] & 0xFF) << 16) + (((Static459.aByteArray93[5] & 0xFF) << 8) + (Static459.aByteArray93[6] & 0xFF));
						@Pc(239) int local239 = Static459.aByteArray93[7] & 0xFF;
						if (arg0 == local195 && local139 == local210 && this.anInt7764 == local239) {
							if (local233 >= 0 && this.aClass159_4.method4063() / 520L >= (long) local233) {
								local139++;
								for (@Pc(287) int local287 = 0; local287 < local167; local287++) {
									local126[local128++] = Static459.aByteArray93[local287 + 8];
								}
								local93 = local233;
								continue;
							}
							return null;
						}
						return null;
					}
					return local126;
				} else {
					return null;
				}
			} catch (@Pc(314) IOException local314) {
				return null;
			}
		}
	}
}
