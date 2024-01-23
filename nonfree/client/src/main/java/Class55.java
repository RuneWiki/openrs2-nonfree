import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class55 {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!dd;")
	private Class31 aClass31_1 = null;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	private int anInt1736 = 65000;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!dd;")
	private Class31 aClass31_2 = null;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "I")
	private int anInt1741;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ILclient!dd;Lclient!dd;I)V")
	public Class55(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int arg3) {
		this.aClass31_1 = arg1;
		this.anInt1741 = arg0;
		this.aClass31_2 = arg2;
		this.anInt1736 = arg3;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII[BI)Z")
	private boolean method1426(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(9) Class31 local9 = this.aClass31_1;
		synchronized (this.aClass31_1) {
			try {
				@Pc(24) int local24;
				@Pc(46) boolean local46;
				if (arg0) {
					if (this.aClass31_2.method944() < (long) (arg1 * 6 + 6)) {
						local46 = false;
						return local46;
					}
					this.aClass31_2.method952((long) (arg1 * 6));
					this.aClass31_2.method948(6, Static147.aByteArray33, 0);
					local24 = ((Static147.aByteArray33[3] & 0xFF) << 16) + ((Static147.aByteArray33[4] & 0xFF) << 8) + (Static147.aByteArray33[5] & 0xFF);
					if (local24 <= 0 || (long) local24 > this.aClass31_1.method944() / 520L) {
						local46 = false;
						return local46;
					}
				} else {
					local24 = (int) ((this.aClass31_1.method944() + 519L) / 520L);
					if (local24 == 0) {
						local24 = 1;
					}
				}
				Static147.aByteArray33[5] = (byte) local24;
				Static147.aByteArray33[4] = (byte) (local24 >> 8);
				Static147.aByteArray33[2] = (byte) arg2;
				Static147.aByteArray33[1] = (byte) (arg2 >> 8);
				@Pc(134) int local134 = 0;
				Static147.aByteArray33[3] = (byte) (local24 >> 16);
				Static147.aByteArray33[0] = (byte) (arg2 >> 16);
				this.aClass31_2.method952((long) (arg1 * 6));
				@Pc(170) int local170 = 0;
				this.aClass31_2.method953(0, 6, Static147.aByteArray33);
				while (true) {
					if (arg2 > local134) {
						label135: {
							@Pc(184) int local184 = 0;
							@Pc(219) int local219;
							if (arg0) {
								this.aClass31_1.method952((long) (local24 * 520));
								try {
									this.aClass31_1.method948(8, Static147.aByteArray33, 0);
								} catch (@Pc(203) EOFException local203) {
									break label135;
								}
								local219 = (Static147.aByteArray33[1] & 0xFF) + ((Static147.aByteArray33[0] & 0xFF) << 8);
								local184 = (Static147.aByteArray33[6] & 0xFF) + (((Static147.aByteArray33[4] & 0xFF) << 16) + ((Static147.aByteArray33[5] & 0xFF) << 8));
								@Pc(256) int local256 = ((Static147.aByteArray33[2] & 0xFF) << 8) + (Static147.aByteArray33[3] & 0xFF);
								@Pc(262) int local262 = Static147.aByteArray33[7] & 0xFF;
								if (arg1 != local219 || local256 != local170 || this.anInt1741 != local262) {
									local46 = false;
									return local46;
								}
								if (local184 < 0 || this.aClass31_1.method944() / 520L < (long) local184) {
									local46 = false;
									return local46;
								}
							}
							if (local184 == 0) {
								local184 = (int) ((this.aClass31_1.method944() + 519L) / 520L);
								arg0 = false;
								if (local184 == 0) {
									local184++;
								}
								if (local24 == local184) {
									local184++;
								}
							}
							Static147.aByteArray33[2] = (byte) (local170 >> 8);
							Static147.aByteArray33[0] = (byte) (arg1 >> 8);
							if (arg2 - local134 <= 512) {
								local184 = 0;
							}
							Static147.aByteArray33[1] = (byte) arg1;
							Static147.aByteArray33[4] = (byte) (local184 >> 16);
							Static147.aByteArray33[7] = (byte) this.anInt1741;
							Static147.aByteArray33[6] = (byte) local184;
							Static147.aByteArray33[3] = (byte) local170;
							Static147.aByteArray33[5] = (byte) (local184 >> 8);
							local170++;
							local219 = arg2 - local134;
							this.aClass31_1.method952((long) (local24 * 520));
							this.aClass31_1.method953(0, 8, Static147.aByteArray33);
							local24 = local184;
							if (local219 > 512) {
								local219 = 512;
							}
							this.aClass31_1.method953(local134, local219, arg3);
							local134 += local219;
							continue;
						}
					}
					local46 = true;
					return local46;
				}
			} catch (@Pc(447) IOException local447) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)[B")
	public byte[] method1429(@OriginalArg(0) int arg0) {
		@Pc(9) Class31 local9 = this.aClass31_1;
		synchronized (this.aClass31_1) {
			try {
				@Pc(24) Object local24;
				if ((long) (arg0 * 6 + 6) > this.aClass31_2.method944()) {
					local24 = null;
					return (byte[]) local24;
				}
				this.aClass31_2.method952((long) (arg0 * 6));
				this.aClass31_2.method948(6, Static147.aByteArray33, 0);
				@Pc(64) int local64 = ((Static147.aByteArray33[1] & 0xFF) << 8) + ((Static147.aByteArray33[0] & 0xFF) << 16) + (Static147.aByteArray33[2] & 0xFF);
				@Pc(86) int local86 = (Static147.aByteArray33[5] & 0xFF) + ((Static147.aByteArray33[3] & 0xFF) << 16) + ((Static147.aByteArray33[4] & 0xFF) << 8);
				if (local64 < 0 || local64 > this.anInt1736) {
					local24 = null;
					return (byte[]) local24;
				} else if (local86 <= 0 || this.aClass31_1.method944() / 520L < (long) local86) {
					local24 = null;
					return (byte[]) local24;
				} else {
					@Pc(129) byte[] local129 = new byte[local64];
					@Pc(131) int local131 = 0;
					@Pc(141) int local141 = 0;
					while (local131 < local64) {
						if (local86 == 0) {
							local24 = null;
							return (byte[]) local24;
						}
						this.aClass31_1.method952((long) (local86 * 520));
						@Pc(171) int local171 = local64 - local131;
						if (local171 > 512) {
							local171 = 512;
						}
						this.aClass31_1.method948(local171 + 8, Static147.aByteArray33, 0);
						@Pc(201) int local201 = (Static147.aByteArray33[3] & 0xFF) + ((Static147.aByteArray33[2] & 0xFF) << 8);
						@Pc(207) int local207 = Static147.aByteArray33[7] & 0xFF;
						@Pc(221) int local221 = (Static147.aByteArray33[1] & 0xFF) + ((Static147.aByteArray33[0] & 0xFF) << 8);
						@Pc(244) int local244 = ((Static147.aByteArray33[4] & 0xFF) << 16) + ((Static147.aByteArray33[5] & 0xFF) << 8) + (Static147.aByteArray33[6] & 0xFF);
						if (local221 != arg0 || local141 != local201 || local207 != this.anInt1741) {
							local24 = null;
							return (byte[]) local24;
						}
						if (local244 < 0 || this.aClass31_1.method944() / 520L < (long) local244) {
							local24 = null;
							return (byte[]) local24;
						}
						local86 = local244;
						local141++;
						for (@Pc(295) int local295 = 0; local295 < local171; local295++) {
							local129[local131++] = Static147.aByteArray33[local295 + 8];
						}
					}
					@Pc(317) byte[] local317 = local129;
					return local317;
				}
			} catch (@Pc(321) IOException local321) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1741;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BIII)Z")
	public boolean method1430(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class31 local7 = this.aClass31_1;
		synchronized (this.aClass31_1) {
			if (arg1 < 0 || this.anInt1736 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(28) boolean local28 = this.method1426(true, arg2, arg1, arg0);
			if (!local28) {
				local28 = this.method1426(false, arg2, arg1, arg0);
			}
			return local28;
		}
	}
}
