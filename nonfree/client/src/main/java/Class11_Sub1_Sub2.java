import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 implements Interface4 {

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "Lclient!oh;")
	public final Class156 aClass156_1;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "Z")
	private final boolean aBoolean347;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray2[local6] = new Rectangle();
		}
		new Class106("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!fp;Lclient!gn;IIIIIIZI)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean164, arg1.aBoolean163);
		this.aClass156_1 = new Class156(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean347 = arg1.anInt2377 != 0 && !arg8;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return this.aClass156_1.method4181(false, 0, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return false;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return this.aClass156_1.anInt4552;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
		this.aClass156_1.method4187(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		@Pc(16) Class3 local16 = this.aClass156_1.method4181(false, super.anInt5302, true, super.anInt5299, arg0, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class129 local23 = arg0.method4634();
		local23.method5774(super.anInt5302, super.anInt5301, super.anInt5299);
		@Pc(33) Class32_Sub7 local33 = null;
		if (this.aBoolean347) {
			local33 = Static67.method1550(1);
		}
		if (this.aClass156_1.aClass32_Sub2_2 == null) {
			local16.method1242(local23, local33 == null ? null : local33.aClass32_Sub4Array1[0], 0);
		} else {
			@Pc(70) Class26 local70 = this.aClass156_1.aClass32_Sub2_2.method1403();
			arg0.method4655(local16, local70, local23, local33 == null ? null : local33.aClass32_Sub4Array1[0]);
		}
		this.aClass156_1.method4183(super.anInt5299 >> 7, super.anInt5299 >> 7, super.anInt5302 >> 7, true, arg0, local16, super.anInt5302 >> 7);
		return local33;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
		@Pc(16) Class3 local16 = this.aClass156_1.method4181(true, super.anInt5302, true, super.anInt5299, arg0, 131072);
		if (local16 != null) {
			this.aClass156_1.method4183(super.anInt5299 >> 7, super.anInt5299 >> 7, super.anInt5302 >> 7, false, arg0, local16, super.anInt5302 >> 7);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return this.aClass156_1.anInt4554;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return this.aClass156_1.method4192();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return this.aClass156_1.anInt4545;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
		this.aClass156_1.method4189(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class3 local21 = this.aClass156_1.method4181(false, super.anInt5302, false, super.anInt5299, arg0, 65536);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class129 local28 = arg0.method4634();
			local28.method5774(super.anInt5302, super.anInt5301, super.anInt5299);
			return local21.method1283(arg2, arg1, local28, false);
		}
	}
}
