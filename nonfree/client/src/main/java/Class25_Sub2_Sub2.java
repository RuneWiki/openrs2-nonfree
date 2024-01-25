import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class25_Sub2_Sub2 extends Class25_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "Lclient!th;")
	public final Class190 aClass190_4;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!en;Lclient!nl;IIIIIIIZI)V")
	public Class25_Sub2_Sub2(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static138.method2593(arg2, arg3));
		this.aClass190_4 = new Class190(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt4332, super.anInt4333, arg9, arg10);
		this.aBoolean318 = arg1.anInt4164 != 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
		@Pc(19) Class101 local19 = this.aClass190_4.method5231(super.anInt4333, true, arg0, true, super.anInt4332, 131072);
		if (local19 != null) {
			this.aClass190_4.method5228(super.anInt4332 >> 7, super.anInt4332 >> 7, super.anInt4333 >> 7, false, arg0, super.anInt4333 >> 7, local19);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		@Pc(16) Class101 local16 = this.aClass190_4.method5231(super.anInt4333, true, arg0, false, super.anInt4332, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class112 local23 = arg0.method4798();
		local23.method3589(super.anInt4332, super.anInt4330, super.anInt4333);
		@Pc(33) Class63_Sub3 local33 = null;
		if (this.aBoolean318) {
			local33 = Static273.method4667(1);
		}
		if (this.aClass190_4.aClass63_Sub5_6 == null) {
			local16.method5172(local23, local33 == null ? null : local33.aClass63_Sub7Array1[0], 0);
		} else {
			@Pc(55) Class21 local55 = this.aClass190_4.aClass63_Sub5_6.method4125();
			arg0.method4811(local16, local55, local23, local33 == null ? null : local33.aClass63_Sub7Array1[0]);
		}
		this.aClass190_4.method5228(super.anInt4332 >> 7, super.anInt4332 >> 7, super.anInt4333 >> 7, true, arg0, super.anInt4333 >> 7, local16);
		return local33;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5551() {
		return this.aClass190_4.method5229();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(21) Class101 local21 = this.aClass190_4.method5231(super.anInt4333, false, arg2, false, super.anInt4332, 65536);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class112 local28 = arg2.method4798();
			local28.method3589(super.anInt4332, super.anInt4330, super.anInt4333);
			return local21.method5187(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!en;)V")
	@Override
	public void method5550(@OriginalArg(1) Class59 arg0) {
		this.aClass190_4.method5223(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I")
	@Override
	public int method5549() {
		return this.aClass190_4.anInt5883;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)I")
	@Override
	public int method5554() {
		return this.aClass190_4.anInt5881;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	@Override
	public void method5553() {
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)I")
	@Override
	public int method5552() {
		return this.aClass190_4.anInt5878;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BILclient!en;)Lclient!mj;")
	@Override
	public Class101 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		return this.aClass190_4.method5231(0, false, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!en;B)V")
	@Override
	public void method5555(@OriginalArg(0) Class59 arg0) {
		this.aClass190_4.method5227(arg0);
	}
}
