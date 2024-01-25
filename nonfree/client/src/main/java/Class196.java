import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class196 {

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "Lclient!sg;")
	private Class305 aClass305_4 = null;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
	private int anInt5998 = 65000;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "Lclient!sg;")
	private Class305 aClass305_3 = null;

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
	private final int anInt5996;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(ILclient!sg;Lclient!sg;I)V")
	public Class196(@OriginalArg(0) int arg0, @OriginalArg(1) Class305 arg1, @OriginalArg(2) Class305 arg2, @OriginalArg(3) int arg3) {
		this.anInt5998 = arg3;
		this.aClass305_3 = arg2;
		this.aClass305_4 = arg1;
		this.anInt5996 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BI)[B")
	public byte[] method5175(@OriginalArg(1) int arg0) {
		@Pc(8) Class305 local8 = this.aClass305_4;
		synchronized (this.aClass305_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass305_3.method7514()) {
					return null;
				}
				this.aClass305_3.method7509((long) (arg0 * 6));
				this.aClass305_3.method7511(6, Static72.aByteArray14, 0);
				@Pc(65) int local65 = ((Static72.aByteArray14[0] & 0xFF) << 16) + ((Static72.aByteArray14[1] & 0xFF) << 8) + (Static72.aByteArray14[2] & 0xFF);
				@Pc(88) int local88 = ((Static72.aByteArray14[3] & 0xFF) << 16) + ((Static72.aByteArray14[4] & 0xFF) << 8) + (Static72.aByteArray14[5] & 0xFF);
				if (local65 < 0 || local65 > this.anInt5998) {
					return null;
				} else if (local88 > 0 && this.aClass305_4.method7514() / 520L >= (long) local88) {
					@Pc(130) byte[] local130 = new byte[local65];
					@Pc(132) int local132 = 0;
					@Pc(134) int local134 = 0;
					while (local132 < local65) {
						if (local88 == 0) {
							return null;
						}
						this.aClass305_4.method7509((long) (local88 * 520));
						@Pc(160) int local160 = local65 - local132;
						if (local160 > 512) {
							local160 = 512;
						}
						this.aClass305_4.method7511(local160 + 8, Static72.aByteArray14, 0);
						@Pc(191) int local191 = ((Static72.aByteArray14[0] & 0xFF) << 8) + (Static72.aByteArray14[1] & 0xFF);
						@Pc(206) int local206 = ((Static72.aByteArray14[2] & 0xFF) << 8) + (Static72.aByteArray14[3] & 0xFF);
						@Pc(229) int local229 = (Static72.aByteArray14[6] & 0xFF) + ((Static72.aByteArray14[4] & 0xFF) << 16) + ((Static72.aByteArray14[5] & 0xFF) << 8);
						@Pc(235) int local235 = Static72.aByteArray14[7] & 0xFF;
						if (arg0 == local191 && local206 == local134 && local235 == this.anInt5996) {
							if (local229 >= 0 && (long) local229 <= this.aClass305_4.method7514() / 520L) {
								local88 = local229;
								for (@Pc(284) int local284 = 0; local284 < local160; local284++) {
									local130[local132++] = Static72.aByteArray14[local284 + 8];
								}
								local134++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local130;
				} else {
					return null;
				}
			} catch (@Pc(310) IOException local310) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III[B)Z")
	public boolean method5176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class305 local6 = this.aClass305_4;
		synchronized (this.aClass305_4) {
			if (arg1 < 0 || arg1 > this.anInt5998) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method5179(arg0, true, arg2, arg1);
			if (!local39) {
				local39 = this.method5179(arg0, false, arg2, arg1);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!kv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5996;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZZ[BI)Z")
	private boolean method5179(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class305 local8 = this.aClass305_4;
		synchronized (this.aClass305_4) {
			try {
				@Pc(68) int local68;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass305_3.method7514()) {
						return false;
					}
					this.aClass305_3.method7509((long) (arg0 * 6));
					this.aClass305_3.method7511(6, Static72.aByteArray14, 0);
					local68 = ((Static72.aByteArray14[4] & 0xFF) << 8) + ((Static72.aByteArray14[3] & 0xFF) << 16) + (Static72.aByteArray14[5] & 0xFF);
					if (local68 <= 0 || (long) local68 > this.aClass305_4.method7514() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass305_4.method7514() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static72.aByteArray14[4] = (byte) (local68 >> 8);
				Static72.aByteArray14[5] = (byte) local68;
				Static72.aByteArray14[2] = (byte) arg3;
				Static72.aByteArray14[0] = (byte) (arg3 >> 16);
				Static72.aByteArray14[3] = (byte) (local68 >> 16);
				Static72.aByteArray14[1] = (byte) (arg3 >> 8);
				this.aClass305_3.method7509((long) (arg0 * 6));
				this.aClass305_3.method7508(Static72.aByteArray14, 0, 6);
				@Pc(176) int local176 = 0;
				@Pc(178) int local178 = 0;
				while (arg3 > local176) {
					@Pc(182) int local182 = 0;
					@Pc(218) int local218;
					if (arg1) {
						this.aClass305_4.method7509((long) (local68 * 520));
						try {
							this.aClass305_4.method7511(8, Static72.aByteArray14, 0);
						} catch (@Pc(201) EOFException local201) {
							return true;
						}
						local218 = ((Static72.aByteArray14[0] & 0xFF) << 8) + (Static72.aByteArray14[1] & 0xFF);
						local182 = ((Static72.aByteArray14[4] & 0xFF) << 16) + ((Static72.aByteArray14[5] & 0xFF) << 8) + (Static72.aByteArray14[6] & 0xFF);
						@Pc(256) int local256 = (Static72.aByteArray14[3] & 0xFF) + ((Static72.aByteArray14[2] & 0xFF) << 8);
						@Pc(262) int local262 = Static72.aByteArray14[7] & 0xFF;
						if (local218 != arg0 || local256 != local178 || this.anInt5996 != local262) {
							return false;
						}
						if (local182 < 0 || (long) local182 > this.aClass305_4.method7514() / 520L) {
							return false;
						}
					}
					if (local182 == 0) {
						arg1 = false;
						local182 = (int) ((this.aClass305_4.method7514() + 519L) / 520L);
						if (local182 == 0) {
							local182++;
						}
						if (local182 == local68) {
							local182++;
						}
					}
					Static72.aByteArray14[1] = (byte) arg0;
					Static72.aByteArray14[3] = (byte) local178;
					Static72.aByteArray14[2] = (byte) (local178 >> 8);
					Static72.aByteArray14[0] = (byte) (arg0 >> 8);
					if (arg3 - local176 <= 512) {
						local182 = 0;
					}
					Static72.aByteArray14[6] = (byte) local182;
					Static72.aByteArray14[5] = (byte) (local182 >> 8);
					Static72.aByteArray14[4] = (byte) (local182 >> 16);
					Static72.aByteArray14[7] = (byte) this.anInt5996;
					this.aClass305_4.method7509((long) (local68 * 520));
					this.aClass305_4.method7508(Static72.aByteArray14, 0, 8);
					local218 = arg3 - local176;
					if (local218 > 512) {
						local218 = 512;
					}
					this.aClass305_4.method7508(arg2, local176, local218);
					local178++;
					local176 += local218;
					local68 = local182;
				}
				return true;
			} catch (@Pc(436) IOException local436) {
				return false;
			}
		}
	}
}
