import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class75 {

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!id;")
	private Class38 aClass38_3 = null;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!id;")
	private Class38 aClass38_4 = null;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	private int anInt2889 = 65000;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "I")
	private final int anInt2892;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ILclient!id;Lclient!id;I)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) int arg3) {
		this.aClass38_3 = arg2;
		this.anInt2889 = arg3;
		this.aClass38_4 = arg1;
		this.anInt2892 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2892;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BIBI)Z")
	public boolean method2016(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class38 local6 = this.aClass38_4;
		synchronized (this.aClass38_4) {
			if (arg1 < 0 || arg1 > this.anInt2889) {
				throw new IllegalArgumentException();
			}
			@Pc(42) boolean local42 = this.method2020(arg0, arg2, true, arg1);
			if (!local42) {
				local42 = this.method2020(arg0, arg2, false, arg1);
			}
			return local42;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)[B")
	public byte[] method2018(@OriginalArg(0) int arg0) {
		@Pc(8) Class38 local8 = this.aClass38_4;
		synchronized (this.aClass38_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass38_3.method892()) {
					return null;
				}
				this.aClass38_3.method885((long) (arg0 * 6));
				this.aClass38_3.method891(0, 6, Static55.aByteArray11);
				@Pc(72) int local72 = (Static55.aByteArray11[5] & 0xFF) + ((Static55.aByteArray11[4] & 0xFF) << 8) + ((Static55.aByteArray11[3] & 0xFF) << 16);
				@Pc(95) int local95 = ((Static55.aByteArray11[0] & 0xFF) << 16) + ((Static55.aByteArray11[1] & 0xFF) << 8) + (Static55.aByteArray11[2] & 0xFF);
				if (local95 < 0 || local95 > this.anInt2889) {
					return null;
				} else if (local72 > 0 && (long) local72 <= this.aClass38_4.method892() / 520L) {
					@Pc(131) int local131 = 0;
					@Pc(134) byte[] local134 = new byte[local95];
					@Pc(136) int local136 = 0;
					while (local131 < local95) {
						if (local72 == 0) {
							return null;
						}
						@Pc(150) int local150 = local95 - local131;
						if (local150 > 512) {
							local150 = 512;
						}
						this.aClass38_4.method885((long) (local72 * 520));
						this.aClass38_4.method891(0, local150 + 8, Static55.aByteArray11);
						@Pc(188) int local188 = (Static55.aByteArray11[1] & 0xFF) + ((Static55.aByteArray11[0] & 0xFF) << 8);
						@Pc(210) int local210 = (Static55.aByteArray11[6] & 0xFF) + ((Static55.aByteArray11[5] & 0xFF) << 8) + ((Static55.aByteArray11[4] & 0xFF) << 16);
						@Pc(224) int local224 = (Static55.aByteArray11[3] & 0xFF) + ((Static55.aByteArray11[2] & 0xFF) << 8);
						@Pc(230) int local230 = Static55.aByteArray11[7] & 0xFF;
						if (local188 == arg0 && local136 == local224 && local230 == this.anInt2892) {
							if (local210 >= 0 && (long) local210 <= this.aClass38_4.method892() / 520L) {
								for (@Pc(273) int local273 = 0; local273 < local150; local273++) {
									local134[local131++] = Static55.aByteArray11[local273 + 8];
								}
								local72 = local210;
								local136++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(309) IOException local309) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BZIZI)Z")
	private boolean method2020(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class38 local8 = this.aClass38_4;
		synchronized (this.aClass38_4) {
			try {
				@Pc(72) int local72;
				if (arg2) {
					if ((long) (arg1 * 6 + 6) > this.aClass38_3.method892()) {
						return false;
					}
					this.aClass38_3.method885((long) (arg1 * 6));
					this.aClass38_3.method891(0, 6, Static55.aByteArray11);
					local72 = ((Static55.aByteArray11[4] & 0xFF) << 8) + ((Static55.aByteArray11[3] & 0xFF) << 16) + (Static55.aByteArray11[5] & 0xFF);
					if (local72 <= 0 || (long) local72 > this.aClass38_4.method892() / 520L) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass38_4.method892() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static55.aByteArray11[5] = (byte) local72;
				Static55.aByteArray11[2] = (byte) arg3;
				Static55.aByteArray11[0] = (byte) (arg3 >> 16);
				Static55.aByteArray11[4] = (byte) (local72 >> 8);
				Static55.aByteArray11[1] = (byte) (arg3 >> 8);
				@Pc(153) int local153 = 0;
				@Pc(155) int local155 = 0;
				Static55.aByteArray11[3] = (byte) (local72 >> 16);
				this.aClass38_3.method885((long) (arg1 * 6));
				this.aClass38_3.method887(Static55.aByteArray11, 0, 6);
				while (local153 < arg3) {
					@Pc(181) int local181 = 0;
					@Pc(216) int local216;
					if (arg2) {
						this.aClass38_4.method885((long) (local72 * 520));
						try {
							this.aClass38_4.method891(0, 8, Static55.aByteArray11);
						} catch (@Pc(200) EOFException local200) {
							return true;
						}
						local216 = (Static55.aByteArray11[1] & 0xFF) + ((Static55.aByteArray11[0] & 0xFF) << 8);
						local181 = ((Static55.aByteArray11[5] & 0xFF) << 8) + ((Static55.aByteArray11[4] & 0xFF) << 16) + (Static55.aByteArray11[6] & 0xFF);
						@Pc(253) int local253 = (Static55.aByteArray11[3] & 0xFF) + ((Static55.aByteArray11[2] & 0xFF) << 8);
						@Pc(259) int local259 = Static55.aByteArray11[7] & 0xFF;
						if (arg1 != local216 || local253 != local155 || local259 != this.anInt2892) {
							return false;
						}
						if (local181 < 0 || (long) local181 > this.aClass38_4.method892() / 520L) {
							return false;
						}
					}
					local216 = arg3 - local153;
					if (local181 == 0) {
						local181 = (int) ((this.aClass38_4.method892() + 519L) / 520L);
						if (local181 == 0) {
							local181++;
						}
						arg2 = false;
						if (local181 == local72) {
							local181++;
						}
					}
					if (local216 > 512) {
						local216 = 512;
					}
					Static55.aByteArray11[0] = (byte) (arg1 >> 8);
					Static55.aByteArray11[3] = (byte) local155;
					Static55.aByteArray11[2] = (byte) (local155 >> 8);
					local155++;
					Static55.aByteArray11[7] = (byte) this.anInt2892;
					Static55.aByteArray11[1] = (byte) arg1;
					if (arg3 - local153 <= 512) {
						local181 = 0;
					}
					Static55.aByteArray11[6] = (byte) local181;
					Static55.aByteArray11[4] = (byte) (local181 >> 16);
					Static55.aByteArray11[5] = (byte) (local181 >> 8);
					this.aClass38_4.method885((long) (local72 * 520));
					this.aClass38_4.method887(Static55.aByteArray11, 0, 8);
					local72 = local181;
					this.aClass38_4.method887(arg0, local153, local216);
					local153 += local216;
				}
				return true;
			} catch (@Pc(434) IOException local434) {
				return false;
			}
		}
	}
}
