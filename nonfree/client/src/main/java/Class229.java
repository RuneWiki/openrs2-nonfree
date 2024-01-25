import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class229 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!mp;")
	private final Class222 aClass222_25 = new Class222(256);

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!mp;")
	private final Class222 aClass222_26 = new Class222(256);

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!eq;")
	private final Class97 aClass97_94;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!eq;")
	private final Class97 aClass97_93;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!eq;Lclient!eq;)V")
	public Class229(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1) {
		this.aClass97_94 = arg0;
		this.aClass97_93 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII[I)Lclient!cj;")
	private Class2_Sub12_Sub1 method5559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg1 >>> 12 | (arg1 & 0xA0000FFF) << 4) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub12_Sub1 local33 = (Class2_Sub12_Sub1) this.aClass222_26.method5468(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(52) Class2_Sub14 local52 = (Class2_Sub14) this.aClass222_25.method5468(local26);
			if (local52 == null) {
				local52 = Static83.method1540(this.aClass97_93, arg1, arg0);
				if (local52 == null) {
					return null;
				}
				this.aClass222_25.method5476(local52, local26);
			}
			local33 = local52.method1537(arg2);
			if (local33 == null) {
				return null;
			} else {
				local52.method8599();
				this.aClass222_26.method5476(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI[I)Lclient!cj;")
	public Class2_Sub12_Sub1 method5560(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass97_94.method2546() == 1) {
			return this.method5561(arg1, arg0, 0);
		} else if (this.aClass97_94.method2569(arg0) == 1) {
			return this.method5561(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([IBII)Lclient!cj;")
	private Class2_Sub12_Sub1 method5561(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg2 & 0x90000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(33) long local33 = (long) local21;
		@Pc(40) Class2_Sub12_Sub1 local40 = (Class2_Sub12_Sub1) this.aClass222_26.method5468(local33);
		if (local40 != null) {
			return local40;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(61) Class243 local61 = Static650.method6254(this.aClass97_94, arg2, arg1);
			if (local61 == null) {
				return null;
			}
			local40 = local61.method6256();
			this.aClass222_26.method5476(local40, local33);
			if (arg0 != null) {
				arg0[0] -= local40.aByteArray21.length;
			}
			return local40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(BI[I)Lclient!cj;")
	public Class2_Sub12_Sub1 method5563(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass97_93.method2546() == 1) {
			return this.method5559(arg0, 0, arg1);
		} else if (this.aClass97_93.method2569(arg0) == 1) {
			return this.method5559(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
