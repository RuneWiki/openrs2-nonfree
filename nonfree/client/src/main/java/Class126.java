import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public final class Class126 {

	@OriginalMember(owner = "client!fia", name = "g", descriptor = "Lclient!qha;")
	private final Class291 aClass291_14 = new Class291(256);

	@OriginalMember(owner = "client!fia", name = "e", descriptor = "Lclient!qha;")
	private final Class291 aClass291_15 = new Class291(256);

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "Lclient!la;")
	private final Class208 aClass208_44;

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "Lclient!la;")
	private final Class208 aClass208_45;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lclient!la;Lclient!la;)V")
	public Class126(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1) {
		this.aClass208_44 = arg1;
		this.aClass208_45 = arg0;
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(II[II)Lclient!ps;")
	private Class5_Sub24_Sub1 method2488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(21) int local21 = (arg0 << 4 & 0xFFFD | arg0 >>> 12) ^ arg1;
		@Pc(27) int local27 = local21 | arg0 << 16;
		@Pc(32) long local32 = (long) local27 ^ 0x100000000L;
		@Pc(39) Class5_Sub24_Sub1 local39 = (Class5_Sub24_Sub1) this.aClass291_15.method6993(local32, 1);
		if (local39 != null) {
			return local39;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(65) Class5_Sub37 local65 = (Class5_Sub37) this.aClass291_14.method6993(local32, 1);
			if (local65 == null) {
				local65 = Static406.method5954(this.aClass208_44, arg0, arg1);
				if (local65 == null) {
					return null;
				}
				this.aClass291_14.method6984(local32, local65);
			}
			local39 = local65.method5949(arg2);
			if (local39 == null) {
				return null;
			} else {
				local65.method9327(1);
				this.aClass291_15.method6984(local32, local39);
				return local39;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(I[IB)Lclient!ps;")
	public Class5_Sub24_Sub1 method2489(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass208_44.method4988() == 1) {
			return this.method2488(0, arg0, arg1);
		} else if (this.aClass208_44.method5005(arg0) == 1) {
			return this.method2488(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(I[II)Lclient!ps;")
	public Class5_Sub24_Sub1 method2493(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass208_45.method4988() == 1) {
			return this.method2494(arg0, 0, arg1);
		} else if (this.aClass208_45.method5005(arg0) == 1) {
			return this.method2494(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(II[II)Lclient!ps;")
	private Class5_Sub24_Sub1 method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg1 & 0x60000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class5_Sub24_Sub1 local31 = (Class5_Sub24_Sub1) this.aClass291_15.method6993(local24, 1);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(56) Class206 local56 = Static685.method4947(this.aClass208_45, arg1, arg0);
			if (local56 == null) {
				return null;
			}
			local31 = local56.method4949();
			this.aClass291_15.method6984(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray77.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
