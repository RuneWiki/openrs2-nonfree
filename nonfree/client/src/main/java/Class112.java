import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class112 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
	private int anInt3254 = 65000;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!ip;")
	private Class149 aClass149_2 = null;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!ip;")
	private Class149 aClass149_3 = null;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
	private final int anInt3257;

	static {
		new Class40("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ILclient!ip;Lclient!ip;I)V")
	public Class112(@OriginalArg(0) int arg0, @OriginalArg(1) Class149 arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(3) int arg3) {
		this.anInt3257 = arg0;
		this.anInt3254 = arg3;
		this.aClass149_3 = arg2;
		this.aClass149_2 = arg1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[B")
	public byte[] method2889(@OriginalArg(0) int arg0) {
		@Pc(8) Class149 local8 = this.aClass149_2;
		synchronized (this.aClass149_2) {
			try {
				if (this.aClass149_3.method3477() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass149_3.method3481((long) (arg0 * 6));
				this.aClass149_3.method3482(0, 6, Static232.aByteArray54);
				@Pc(74) int local74 = (Static232.aByteArray54[2] & 0xFF) + ((Static232.aByteArray54[1] & 0xFF) << 8) + ((Static232.aByteArray54[0] & 0xFF) << 16);
				@Pc(96) int local96 = ((Static232.aByteArray54[4] & 0xFF) << 8) + ((Static232.aByteArray54[3] & 0xFF) << 16) + (Static232.aByteArray54[5] & 0xFF);
				if (local74 < 0 || local74 > this.anInt3254) {
					return null;
				} else if (local96 > 0 && this.aClass149_2.method3477() / 520L >= (long) local96) {
					@Pc(136) byte[] local136 = new byte[local74];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					while (local74 > local138) {
						if (local96 == 0) {
							return null;
						}
						this.aClass149_2.method3481((long) (local96 * 520));
						@Pc(162) int local162 = local74 - local138;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass149_2.method3482(0, local162 + 8, Static232.aByteArray54);
						@Pc(190) int local190 = (Static232.aByteArray54[1] & 0xFF) + ((Static232.aByteArray54[0] & 0xFF) << 8);
						@Pc(204) int local204 = ((Static232.aByteArray54[2] & 0xFF) << 8) + (Static232.aByteArray54[3] & 0xFF);
						@Pc(226) int local226 = (Static232.aByteArray54[6] & 0xFF) + ((Static232.aByteArray54[5] & 0xFF) << 8) + ((Static232.aByteArray54[4] & 0xFF) << 16);
						@Pc(232) int local232 = Static232.aByteArray54[7] & 0xFF;
						if (arg0 == local190 && local204 == local140 && local232 == this.anInt3257) {
							if (local226 >= 0 && (long) local226 <= this.aClass149_2.method3477() / 520L) {
								for (@Pc(279) int local279 = 0; local279 < local162; local279++) {
									local136[local138++] = Static232.aByteArray54[local279 + 8];
								}
								local96 = local226;
								local140++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local136;
				} else {
					return null;
				}
			} catch (@Pc(315) IOException local315) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZII[B)Z")
	private boolean method2890(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class149 local8 = this.aClass149_2;
		synchronized (this.aClass149_2) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if (this.aClass149_3.method3477() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass149_3.method3481((long) (arg2 * 6));
					this.aClass149_3.method3482(0, 6, Static232.aByteArray54);
					local22 = ((Static232.aByteArray54[3] & 0xFF) << 16) + ((Static232.aByteArray54[4] & 0xFF) << 8) + (Static232.aByteArray54[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass149_2.method3477() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass149_2.method3477() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static232.aByteArray54[5] = (byte) local22;
				Static232.aByteArray54[1] = (byte) (arg1 >> 8);
				Static232.aByteArray54[0] = (byte) (arg1 >> 16);
				Static232.aByteArray54[4] = (byte) (local22 >> 8);
				Static232.aByteArray54[2] = (byte) arg1;
				Static232.aByteArray54[3] = (byte) (local22 >> 16);
				this.aClass149_3.method3481((long) (arg2 * 6));
				this.aClass149_3.method3474(0, Static232.aByteArray54, 6);
				@Pc(177) int local177 = 0;
				@Pc(179) int local179 = 0;
				while (arg1 > local177) {
					@Pc(183) int local183 = 0;
					@Pc(219) int local219;
					if (arg0) {
						this.aClass149_2.method3481((long) (local22 * 520));
						try {
							this.aClass149_2.method3482(0, 8, Static232.aByteArray54);
						} catch (@Pc(202) EOFException local202) {
							return true;
						}
						local219 = ((Static232.aByteArray54[0] & 0xFF) << 8) + (Static232.aByteArray54[1] & 0xFF);
						local183 = (Static232.aByteArray54[6] & 0xFF) + (((Static232.aByteArray54[4] & 0xFF) << 16) + ((Static232.aByteArray54[5] & 0xFF) << 8));
						@Pc(257) int local257 = ((Static232.aByteArray54[2] & 0xFF) << 8) + (Static232.aByteArray54[3] & 0xFF);
						@Pc(263) int local263 = Static232.aByteArray54[7] & 0xFF;
						if (arg2 != local219 || local257 != local179 || local263 != this.anInt3257) {
							return false;
						}
						if (local183 < 0 || this.aClass149_2.method3477() / 520L < (long) local183) {
							return false;
						}
					}
					if (local183 == 0) {
						arg0 = false;
						local183 = (int) ((this.aClass149_2.method3477() + 519L) / 520L);
						if (local183 == 0) {
							local183++;
						}
						if (local22 == local183) {
							local183++;
						}
					}
					Static232.aByteArray54[1] = (byte) arg2;
					Static232.aByteArray54[2] = (byte) (local179 >> 8);
					if (arg1 - local177 <= 512) {
						local183 = 0;
					}
					Static232.aByteArray54[3] = (byte) local179;
					Static232.aByteArray54[0] = (byte) (arg2 >> 8);
					Static232.aByteArray54[7] = (byte) this.anInt3257;
					Static232.aByteArray54[6] = (byte) local183;
					Static232.aByteArray54[5] = (byte) (local183 >> 8);
					Static232.aByteArray54[4] = (byte) (local183 >> 16);
					this.aClass149_2.method3481((long) (local22 * 520));
					this.aClass149_2.method3474(0, Static232.aByteArray54, 8);
					local219 = arg1 - local177;
					if (local219 > 512) {
						local219 = 512;
					}
					this.aClass149_2.method3474(local177, arg3, local219);
					local179++;
					local22 = local183;
					local177 += local219;
				}
				return true;
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3257;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([BBII)Z")
	public boolean method2892(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class149 local6 = this.aClass149_2;
		synchronized (this.aClass149_2) {
			if (arg2 < 0 || arg2 > this.anInt3254) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method2890(true, arg2, arg1, arg0);
			if (!local34) {
				local34 = this.method2890(false, arg2, arg1, arg0);
			}
			return local34;
		}
	}
}
