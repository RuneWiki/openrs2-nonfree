import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class32 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	private int anInt1830 = 65000;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!bc;")
	private Class5 aClass5_1 = null;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!bc;")
	private Class5 aClass5_2 = null;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	private final int anInt1831;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ILclient!bc;Lclient!bc;I)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3) {
		this.anInt1830 = arg3;
		this.anInt1831 = arg0;
		this.aClass5_1 = arg1;
		this.aClass5_2 = arg2;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[BII)Z")
	public boolean method1283(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class5 local14 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			if (arg2 < 0 || this.anInt1830 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method1284(true, arg2, arg1, arg0);
			if (!local34) {
				local34 = this.method1284(false, arg2, arg1, arg0);
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZII[BI)Z")
	private boolean method1284(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5 local8 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			try {
				@Pc(73) int local73;
				if (arg0) {
					if (this.aClass5_2.method394() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass5_2.method391((long) (arg3 * 6));
					this.aClass5_2.method388(Static30.aByteArray10, 6, 0);
					local73 = (Static30.aByteArray10[5] & 0xFF) + ((Static30.aByteArray10[3] & 0xFF) << 16) + ((Static30.aByteArray10[4] & 0xFF) << 8);
					if (local73 <= 0 || (long) local73 > this.aClass5_1.method394() / 520L) {
						return false;
					}
				} else {
					local73 = (int) ((this.aClass5_1.method394() + 519L) / 520L);
					if (local73 == 0) {
						local73 = 1;
					}
				}
				Static30.aByteArray10[3] = (byte) (local73 >> 16);
				Static30.aByteArray10[2] = (byte) arg1;
				Static30.aByteArray10[0] = (byte) (arg1 >> 16);
				Static30.aByteArray10[5] = (byte) local73;
				Static30.aByteArray10[1] = (byte) (arg1 >> 8);
				Static30.aByteArray10[4] = (byte) (local73 >> 8);
				@Pc(148) int local148 = 0;
				this.aClass5_2.method391((long) (arg3 * 6));
				this.aClass5_2.method387(0, 6, Static30.aByteArray10);
				@Pc(210) int local210;
				for (@Pc(169) int local169 = 0; local169 < arg1; local169 += local210) {
					@Pc(173) int local173 = 0;
					if (arg0) {
						this.aClass5_1.method391((long) (local73 * 520));
						try {
							this.aClass5_1.method388(Static30.aByteArray10, 8, 0);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local210 = (Static30.aByteArray10[1] & 0xFF) + ((Static30.aByteArray10[0] & 0xFF) << 8);
						@Pc(225) int local225 = ((Static30.aByteArray10[2] & 0xFF) << 8) + (Static30.aByteArray10[3] & 0xFF);
						local173 = ((Static30.aByteArray10[5] & 0xFF) << 8) + ((Static30.aByteArray10[4] & 0xFF) << 16) + (Static30.aByteArray10[6] & 0xFF);
						@Pc(253) int local253 = Static30.aByteArray10[7] & 0xFF;
						if (arg3 != local210 || local148 != local225 || local253 != this.anInt1831) {
							return false;
						}
						if (local173 < 0 || this.aClass5_1.method394() / 520L < (long) local173) {
							return false;
						}
					}
					if (local173 == 0) {
						local173 = (int) ((this.aClass5_1.method394() + 519L) / 520L);
						arg0 = false;
						if (local173 == 0) {
							local173++;
						}
						if (local73 == local173) {
							local173++;
						}
					}
					Static30.aByteArray10[1] = (byte) arg3;
					Static30.aByteArray10[3] = (byte) local148;
					if (arg1 - local169 <= 512) {
						local173 = 0;
					}
					Static30.aByteArray10[2] = (byte) (local148 >> 8);
					Static30.aByteArray10[6] = (byte) local173;
					Static30.aByteArray10[0] = (byte) (arg3 >> 8);
					Static30.aByteArray10[5] = (byte) (local173 >> 8);
					Static30.aByteArray10[4] = (byte) (local173 >> 16);
					Static30.aByteArray10[7] = (byte) this.anInt1831;
					local148++;
					this.aClass5_1.method391((long) (local73 * 520));
					this.aClass5_1.method387(0, 8, Static30.aByteArray10);
					local73 = local173;
					local210 = arg1 - local169;
					if (local210 > 512) {
						local210 = 512;
					}
					this.aClass5_1.method387(local169, local210, arg2);
				}
				return true;
			} catch (@Pc(441) IOException local441) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1831;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[B")
	public byte[] method1285(@OriginalArg(1) int arg0) {
		@Pc(8) Class5 local8 = this.aClass5_1;
		synchronized (this.aClass5_1) {
			try {
				if (this.aClass5_2.method394() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass5_2.method391((long) (arg0 * 6));
				this.aClass5_2.method388(Static30.aByteArray10, 6, 0);
				@Pc(75) int local75 = (Static30.aByteArray10[2] & 0xFF) + ((Static30.aByteArray10[0] & 0xFF) << 16) + ((Static30.aByteArray10[1] & 0xFF) << 8);
				@Pc(99) int local99 = ((Static30.aByteArray10[3] & 0xFF) << 16) + (Static30.aByteArray10[4] << 8 & 0xFF00) + (Static30.aByteArray10[5] & 0xFF);
				if (local75 < 0 || local75 > this.anInt1830) {
					return null;
				} else if (local99 > 0 && (long) local99 <= this.aClass5_1.method394() / 520L) {
					@Pc(136) byte[] local136 = new byte[local75];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					while (local75 > local138) {
						if (local99 == 0) {
							return null;
						}
						this.aClass5_1.method391((long) (local99 * 520));
						@Pc(166) int local166 = local75 - local138;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass5_1.method388(Static30.aByteArray10, local166 + 8, 0);
						@Pc(205) int local205 = (Static30.aByteArray10[6] & 0xFF) + ((Static30.aByteArray10[4] & 0xFF) << 16) + ((Static30.aByteArray10[5] & 0xFF) << 8);
						@Pc(219) int local219 = ((Static30.aByteArray10[0] & 0xFF) << 8) + (Static30.aByteArray10[1] & 0xFF);
						@Pc(233) int local233 = (Static30.aByteArray10[3] & 0xFF) + ((Static30.aByteArray10[2] & 0xFF) << 8);
						@Pc(239) int local239 = Static30.aByteArray10[7] & 0xFF;
						if (arg0 == local219 && local233 == local140 && this.anInt1831 == local239) {
							if (local205 >= 0 && (long) local205 <= this.aClass5_1.method394() / 520L) {
								local140++;
								for (@Pc(284) int local284 = 0; local284 < local166; local284++) {
									local136[local138++] = Static30.aByteArray10[local284 + 8];
								}
								local99 = local205;
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
			} catch (@Pc(311) IOException local311) {
				return null;
			}
		}
	}
}
