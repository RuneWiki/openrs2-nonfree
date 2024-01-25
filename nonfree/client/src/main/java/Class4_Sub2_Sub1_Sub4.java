import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class4_Sub2_Sub1_Sub4 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!ra", name = "pb", descriptor = "Lclient!em;")
	private Class4_Sub4 aClass4_Sub4_6;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "Z")
	private boolean aBoolean562 = true;

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
	private int anInt7919 = 0;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "Z")
	public boolean aBoolean563 = false;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
	private int anInt7924 = 0;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
	private int anInt7921 = 0;

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
	private int anInt7931 = 0;

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
	private final int anInt7934 = -1;

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
	private int anInt7929 = 0;

	@OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
	private final int anInt7938;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
	public final int anInt7920;

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "Lclient!vga;")
	private Class362 aClass362_2;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class4_Sub2_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7938 = arg0;
		this.anInt7931 = arg12;
		this.anInt7920 = arg2 + arg1;
		@Pc(54) Class82 local54 = Static52.aClass10_1.method211(this.anInt7938);
		@Pc(57) int local57 = local54.anInt2052;
		if (local57 == -1) {
			this.aBoolean563 = true;
		} else {
			this.aClass362_2 = Static435.aClass298_1.method7034(local57);
			this.aBoolean563 = false;
		}
		if (this.anInt7920 == arg2) {
			Static67.method1108(this, this.anInt7929, this.aClass362_2);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
	public void method6976(@OriginalArg(0) int arg0) {
		if (this.aBoolean563) {
			return;
		}
		this.anInt7924 += arg0;
		while (this.aClass362_2.anIntArray573[this.anInt7929] < this.anInt7924) {
			this.anInt7924 -= this.aClass362_2.anIntArray573[this.anInt7929];
			this.anInt7929++;
			if (this.aClass362_2.anIntArray571.length <= this.anInt7929) {
				this.aBoolean563 = true;
				break;
			}
		}
		if (!this.aBoolean563) {
			Static67.method1108(this, this.anInt7929, this.aClass362_2);
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		@Pc(23) Class187 local23 = this.method6981(arg0, (this.anInt7931 == 0 ? 0 : 5) | 0x800, this.anInt7938);
		if (local23 == null) {
			return null;
		}
		if (this.anInt7931 != 0) {
			local23.a(this.anInt7931 * 2048);
		}
		@Pc(40) Class113 local40 = arg0.method7262();
		local40.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
		this.method6980(local23, local40, arg0);
		@Pc(59) Class4_Sub6 local59 = Static242.method4012(1, false);
		if (Static57.aBoolean65) {
			local23.method8654(local40, local59.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			local23.method8645(local40, local59.aClass4_Sub9Array1[0], 0);
		}
		if (this.aClass4_Sub4_6 != null) {
			@Pc(87) Class235 local87 = this.aClass4_Sub4_6.method1961();
			if (Static57.aBoolean65) {
				arg0.method7302(local87, Static469.anInt7885);
			} else {
				arg0.method7308(local87);
			}
		}
		this.aBoolean562 = local23.F();
		this.anInt7919 = local23.fa();
		this.anInt7921 = local23.ma();
		return local59;
	}

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.anInt7921;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public void method6978() {
		if (this.aClass4_Sub4_6 != null) {
			this.aClass4_Sub4_6.method1962();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub4_6 != null) {
			this.aClass4_Sub4_6.method1962();
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.anInt7919;
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aBoolean562;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ka;Lclient!tc;Lclient!ha;B)V")
	private void method6980(@OriginalArg(0) Class187 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class133 arg2) {
		arg0.method8638(arg1);
		@Pc(9) Class261[] local9 = arg0.method8650();
		@Pc(16) Class320[] local16 = arg0.method8636();
		if ((this.aClass4_Sub4_6 == null || this.aClass4_Sub4_6.aBoolean174) && (local9 != null || local16 != null)) {
			this.aClass4_Sub4_6 = Static131.method1960(Static631.anInt10493, true);
		}
		if (this.aClass4_Sub4_6 != null) {
			this.aClass4_Sub4_6.method1966(arg2, (long) Static631.anInt10493, local9, local16);
			this.aClass4_Sub4_6.method1965(super.aByte132, super.aShort107, super.aShort109, super.aShort108, super.aShort110);
		}
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
		@Pc(11) Class187 local11 = this.method6981(arg0, 0, this.anInt7938);
		if (local11 != null) {
			@Pc(16) Class113 local16 = arg0.method7262();
			local16.method8458(super.anInt10231, super.anInt10228, super.anInt10229);
			this.method6980(local11, local16, arg0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;IIB)Lclient!ka;")
	private Class187 method6981(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class82 local13 = Static52.aClass10_1.method211(arg2);
		@Pc(18) Class61 local18 = Static20.aClass61Array2[super.aByte132];
		@Pc(33) Class61 local33 = super.aByte131 < 3 ? Static20.aClass61Array2[super.aByte131 + 1] : null;
		return this.aBoolean563 ? local13.method1689(-1, super.anInt10231, local33, Static435.aClass298_1, arg0, -1, super.anInt10229, 0, arg1, local18, super.anInt10228) : local13.method1689(this.anInt7934, super.anInt10231, local33, Static435.aClass298_1, arg0, this.anInt7929, super.anInt10229, this.anInt7924, arg1, local18, super.anInt10228);
	}
}
