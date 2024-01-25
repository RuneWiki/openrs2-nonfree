import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class67_Sub2_Sub2 extends Class67_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "Lclient!bi;")
	public final Class25 aClass25_3;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "Z")
	private final boolean aBoolean299;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!uo;Lclient!gm;IIIIIIIZI)V")
	public Class67_Sub2_Sub2(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static325.method1028(arg2, arg3));
		this.aClass25_3 = new Class25(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt4515, super.anInt4511, arg9, arg10);
		this.aBoolean299 = arg1.anInt2016 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class126 local16 = this.aClass25_3.method321(super.anInt4515, false, 65536, arg1, false, super.anInt4511);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class61 local23 = arg1.method4979();
			local23.method3666(super.anInt4515, super.anInt4516, super.anInt4511);
			return local16.method3160(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5417(@OriginalArg(0) Class129 arg0) {
		this.aClass25_3.method322(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5412() {
		return this.aClass25_3.method313();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		@Pc(16) Class126 local16 = this.aClass25_3.method321(super.anInt4515, true, 1024, arg0, false, super.anInt4511);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class61 local23 = arg0.method4979();
		local23.method3666(super.anInt4515, super.anInt4516, super.anInt4511);
		@Pc(33) Class10_Sub1 local33 = null;
		if (this.aBoolean299) {
			local33 = Static55.method830(1);
		}
		if (this.aClass25_3.aClass10_Sub2_1 == null) {
			local16.method3139(local23, local33 == null ? null : local33.aClass10_Sub8Array1[0], 0);
		} else {
			@Pc(63) Class136 local63 = this.aClass25_3.aClass10_Sub2_1.method981();
			arg0.method4977(local16, local63, local23, local33 == null ? null : local33.aClass10_Sub8Array1[0]);
		}
		this.aClass25_3.method323(true, super.anInt4515 >> 7, super.anInt4511 >> 7, arg0, super.anInt4515 >> 7, super.anInt4511 >> 7, local16);
		return local33;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
		@Pc(16) Class126 local16 = this.aClass25_3.method321(super.anInt4515, true, 131072, arg0, true, super.anInt4511);
		if (local16 != null) {
			this.aClass25_3.method323(false, super.anInt4515 >> 7, super.anInt4511 >> 7, arg0, super.anInt4515 >> 7, super.anInt4511 >> 7, local16);
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	@Override
	public void method5416() {
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)I")
	@Override
	public int method5414() {
		return this.aClass25_3.anInt412;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	@Override
	public Class126 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		return this.aClass25_3.method321(0, false, arg0, arg1, false, 0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I")
	@Override
	public int method5413() {
		return this.aClass25_3.anInt413;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
	@Override
	public int method5410() {
		return this.aClass25_3.anInt392;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!uo;)V")
	@Override
	public void method5415(@OriginalArg(1) Class129 arg0) {
		this.aClass25_3.method316(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		throw new IllegalStateException();
	}
}
