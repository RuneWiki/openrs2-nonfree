import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!dc;")
	private Class34_Sub1 aClass34_Sub1_6;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt4955 = 0;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	private int anInt4958 = -32768;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
	private boolean aBoolean305 = false;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	private int anInt4969 = -1;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "Z")
	public boolean aBoolean306 = false;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	private int anInt4968 = 0;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public int anInt4961;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public int anInt4966;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	public int anInt4965;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	public int anInt4960;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	private int anInt4956;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public int anInt4962;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "Lclient!d;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4961 = arg1;
		this.anInt4966 = arg6 + arg5;
		this.anInt4965 = arg4;
		this.anInt4960 = arg2;
		this.anInt4956 = arg0;
		this.anInt4962 = arg3;
		@Pc(45) int local45 = Static28.method611(this.anInt4956).anInt3368;
		if (local45 == -1) {
			this.aBoolean306 = true;
		} else {
			this.aBoolean306 = false;
			this.aClass32_3 = Static202.method3231(local45);
		}
		if (this.anInt4966 == arg6) {
			Static154.method2507(false, this.anInt4960, this.anInt4962, this.anInt4968, this.aClass32_3);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!o;)V")
	private void method3728(@OriginalArg(1) Class2_Sub1 arg0) {
		if (Static294.aBoolean367) {
			@Pc(8) Class2_Sub1_Sub1 local8 = (Class2_Sub1_Sub1) arg0;
			if ((this.aClass34_Sub1_6 == null || this.aClass34_Sub1_6.aBoolean73) && (local8.aClass135Array1 != null || local8.aClass86Array1 != null)) {
				this.aClass34_Sub1_6 = new Class34_Sub1(Static133.anInt3061, 1, 1);
			}
			if (this.aClass34_Sub1_6 != null) {
				this.aClass34_Sub1_6.method858(local8.aClass135Array1, local8.aClass86Array1, false, local8.anIntArray6, local8.anIntArray9, local8.anIntArray4);
			}
		} else {
			@Pc(55) Class2_Sub1_Sub2 local55 = (Class2_Sub1_Sub2) arg0;
			if ((this.aClass34_Sub1_6 == null || this.aClass34_Sub1_6.aBoolean73) && (local55.aClass135Array2 != null || local55.aClass86Array2 != null)) {
				this.aClass34_Sub1_6 = new Class34_Sub1(Static133.anInt3061, 1, 1);
			}
			if (this.aClass34_Sub1_6 != null) {
				this.aClass34_Sub1_6.method858(local55.aClass135Array2, local55.aClass86Array2, false, local55.anIntArray61, local55.anIntArray60, local55.anIntArray67);
			}
		}
		this.aBoolean305 = true;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean305) {
			@Pc(10) Class2_Sub1 local10 = this.method3730();
			if (local10 == null) {
				return;
			}
			this.method3728(local10);
		}
		if (this.aClass34_Sub1_6 != null) {
			this.aClass34_Sub1_6.method860(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
	public void method3729(@OriginalArg(1) int arg0) {
		if (this.aBoolean306) {
			return;
		}
		this.anInt4955 += arg0;
		while (this.aClass32_3.anIntArray121[this.anInt4968] < this.anInt4955) {
			this.anInt4955 -= this.aClass32_3.anIntArray121[this.anInt4968];
			this.anInt4968++;
			if (this.anInt4968 >= this.aClass32_3.anIntArray123.length) {
				this.aBoolean306 = true;
				break;
			}
		}
		if (!this.aBoolean306) {
			Static154.method2507(false, this.anInt4960, this.anInt4962, this.anInt4968, this.aClass32_3);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "()I")
	@Override
	public int method3948() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIJILclient!dc;)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class34_Sub1 arg10) {
		@Pc(3) Class2_Sub1 local3 = this.method3730();
		if (local3 != null) {
			this.method3728(local3);
			local3.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass34_Sub1_6);
			this.anInt4958 = local3.method3948();
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Lclient!o;")
	private Class2_Sub1 method3730() {
		@Pc(10) Class94 local10 = Static28.method611(this.anInt4956);
		@Pc(20) Class2_Sub1 local20;
		if (this.aBoolean306) {
			local20 = local10.method2423(0, -1, -1);
		} else {
			local20 = local10.method2423(this.anInt4955, this.anInt4968, this.anInt4969);
		}
		return local20 == null ? null : local20;
	}
}
