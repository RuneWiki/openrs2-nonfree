import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class92 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!cn;")
	private Class30 aClass30_16 = new Class30(256);

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!cn;")
	private Class30 aClass30_17 = new Class30(256);

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!rn;")
	private Class155 aClass155_60;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!rn;")
	private Class155 aClass155_62;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!rn;Lclient!rn;)V")
	public Class92(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1) {
		this.aClass155_60 = arg0;
		this.aClass155_62 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[I)Lclient!qj;")
	private Class3_Sub11_Sub1 method2393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(11) int local11 = arg0 ^ ((arg1 & 0x90000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local11 | arg1 << 16;
		@Pc(31) long local31 = (long) local21;
		@Pc(38) Class3_Sub11_Sub1 local38 = (Class3_Sub11_Sub1) this.aClass30_17.method663(local31);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(60) Class45 local60 = Static317.method1046(this.aClass155_60, arg1, arg0);
			if (local60 == null) {
				return null;
			}
			local38 = local60.method1045();
			this.aClass30_17.method668(local38, local31);
			if (arg2 != null) {
				arg2[0] -= local38.aByteArray59.length;
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB[I)Lclient!qj;")
	public Class3_Sub11_Sub1 method2395(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass155_60.method4119() == 1) {
			return this.method2393(arg0, 0, arg1);
		} else if (this.aClass155_60.method4131(arg0) == 1) {
			return this.method2393(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[II)Lclient!qj;")
	private Class3_Sub11_Sub1 method2396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(11) int local11 = ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12) ^ arg0;
		@Pc(17) int local17 = local11 | arg1 << 16;
		@Pc(26) long local26 = (long) local17 ^ 0x100000000L;
		@Pc(33) Class3_Sub11_Sub1 local33 = (Class3_Sub11_Sub1) this.aClass30_17.method663(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class3_Sub27 local54 = (Class3_Sub27) this.aClass30_16.method663(local26);
			if (local54 == null) {
				local54 = Static242.method4107(this.aClass155_62, arg1, arg0);
				if (local54 == null) {
					return null;
				}
				this.aClass30_16.method668(local54, local26);
			}
			local33 = local54.method4110(arg2);
			if (local33 == null) {
				return null;
			} else {
				local54.method5013();
				this.aClass30_17.method668(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I)Lclient!qj;")
	public Class3_Sub11_Sub1 method2398(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass155_62.method4119() == 1) {
			return this.method2396(arg0, 0, arg1);
		} else if (this.aClass155_62.method4131(arg0) == 1) {
			return this.method2396(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
