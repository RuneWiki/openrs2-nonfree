import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class58 {

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!t;")
	private Class68 aClass68_10 = null;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	private int anInt2167 = 65000;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "Lclient!t;")
	private Class68 aClass68_11 = null;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	private final int anInt2171;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(ILclient!t;Lclient!t;I)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) int arg3) {
		this.anInt2171 = arg0;
		this.anInt2167 = arg3;
		this.aClass68_10 = arg1;
		this.aClass68_11 = arg2;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI[BIB)Z")
	private boolean method1507(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class68 local8 = this.aClass68_10;
		synchronized (this.aClass68_10) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass68_11.method1673()) {
						return false;
					}
					this.aClass68_11.method1685((long) (arg3 * 6));
					this.aClass68_11.method1684(Static99.aByteArray72, 0, 6);
					local22 = ((Static99.aByteArray72[4] & 0xFF) << 8) + ((Static99.aByteArray72[3] & 0xFF) << 16) + (Static99.aByteArray72[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass68_10.method1673() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass68_10.method1673() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static99.aByteArray72[3] = (byte) (local22 >> 16);
				Static99.aByteArray72[0] = (byte) (arg1 >> 16);
				Static99.aByteArray72[2] = (byte) arg1;
				Static99.aByteArray72[4] = (byte) (local22 >> 8);
				@Pc(141) int local141 = 0;
				Static99.aByteArray72[1] = (byte) (arg1 >> 8);
				@Pc(150) int local150 = 0;
				Static99.aByteArray72[5] = (byte) local22;
				this.aClass68_11.method1685((long) (arg3 * 6));
				this.aClass68_11.method1682(0, Static99.aByteArray72, 6);
				while (local150 < arg1) {
					@Pc(174) int local174 = 0;
					@Pc(233) int local233;
					if (arg0) {
						this.aClass68_10.method1685((long) (local22 * 520));
						try {
							this.aClass68_10.method1684(Static99.aByteArray72, 0, 8);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local174 = ((Static99.aByteArray72[4] & 0xFF) << 16) + ((Static99.aByteArray72[5] & 0xFF) << 8) + (Static99.aByteArray72[6] & 0xFF);
						local233 = ((Static99.aByteArray72[0] & 0xFF) << 8) + (Static99.aByteArray72[1] & 0xFF);
						@Pc(247) int local247 = (Static99.aByteArray72[3] & 0xFF) + ((Static99.aByteArray72[2] & 0xFF) << 8);
						@Pc(253) int local253 = Static99.aByteArray72[7] & 0xFF;
						if (local233 != arg3 || local141 != local247 || this.anInt2171 != local253) {
							return false;
						}
						if (local174 < 0 || (long) local174 > this.aClass68_10.method1673() / 520L) {
							return false;
						}
					}
					if (local174 == 0) {
						local174 = (int) ((this.aClass68_10.method1673() + 519L) / 520L);
						if (local174 == 0) {
							local174++;
						}
						arg0 = false;
						if (local22 == local174) {
							local174++;
						}
					}
					local233 = arg1 - local150;
					if (arg1 - local150 <= 512) {
						local174 = 0;
					}
					Static99.aByteArray72[7] = (byte) this.anInt2171;
					Static99.aByteArray72[0] = (byte) (arg3 >> 8);
					Static99.aByteArray72[1] = (byte) arg3;
					Static99.aByteArray72[3] = (byte) local141;
					if (local233 > 512) {
						local233 = 512;
					}
					Static99.aByteArray72[2] = (byte) (local141 >> 8);
					Static99.aByteArray72[4] = (byte) (local174 >> 16);
					Static99.aByteArray72[6] = (byte) local174;
					Static99.aByteArray72[5] = (byte) (local174 >> 8);
					this.aClass68_10.method1685((long) (local22 * 520));
					local22 = local174;
					local141++;
					this.aClass68_10.method1682(0, Static99.aByteArray72, 8);
					this.aClass68_10.method1682(local150, arg2, local233);
					local150 += local233;
				}
				return true;
			} catch (@Pc(429) IOException local429) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[BI)Z")
	public boolean method1508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(14) Class68 local14 = this.aClass68_10;
		synchronized (this.aClass68_10) {
			if (arg0 < 0 || this.anInt2167 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method1507(true, arg0, arg2, arg1);
			if (!local38) {
				local38 = this.method1507(false, arg0, arg2, arg1);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[B")
	public byte[] method1509(@OriginalArg(1) int arg0) {
		@Pc(16) Class68 local16 = this.aClass68_10;
		synchronized (this.aClass68_10) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass68_11.method1673()) {
					return null;
				}
				this.aClass68_11.method1685((long) (arg0 * 6));
				this.aClass68_11.method1684(Static99.aByteArray72, 0, 6);
				@Pc(78) int local78 = ((Static99.aByteArray72[3] & 0xFF) << 16) + (Static99.aByteArray72[4] << 8 & 0xFF00) + (Static99.aByteArray72[5] & 0xFF);
				@Pc(100) int local100 = ((Static99.aByteArray72[0] & 0xFF) << 16) + ((Static99.aByteArray72[1] & 0xFF) << 8) + (Static99.aByteArray72[2] & 0xFF);
				if (local100 < 0 || this.anInt2167 < local100) {
					return null;
				} else if (local78 > 0 && (long) local78 <= this.aClass68_10.method1673() / 520L) {
					@Pc(137) byte[] local137 = new byte[local100];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					while (local100 > local139) {
						if (local78 == 0) {
							return null;
						}
						@Pc(158) int local158 = local100 - local139;
						this.aClass68_10.method1685((long) (local78 * 520));
						if (local158 > 512) {
							local158 = 512;
						}
						this.aClass68_10.method1684(Static99.aByteArray72, 0, local158 + 8);
						@Pc(186) int local186 = Static99.aByteArray72[7] & 0xFF;
						@Pc(200) int local200 = ((Static99.aByteArray72[2] & 0xFF) << 8) + (Static99.aByteArray72[3] & 0xFF);
						@Pc(222) int local222 = (Static99.aByteArray72[6] & 0xFF) + ((Static99.aByteArray72[4] & 0xFF) << 16) + ((Static99.aByteArray72[5] & 0xFF) << 8);
						@Pc(237) int local237 = ((Static99.aByteArray72[0] & 0xFF) << 8) + (Static99.aByteArray72[1] & 0xFF);
						if (arg0 == local237 && local200 == local141 && this.anInt2171 == local186) {
							if (local222 >= 0 && (long) local222 <= this.aClass68_10.method1673() / 520L) {
								local78 = local222;
								for (@Pc(287) int local287 = 0; local287 < local158; local287++) {
									local137[local139++] = Static99.aByteArray72[local287 + 8];
								}
								local141++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local137;
				} else {
					return null;
				}
			} catch (@Pc(317) IOException local317) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2171;
	}
}
