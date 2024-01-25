import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class171 {

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	private int anInt4471 = 0;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Lclient!ip;")
	private Class40 aClass40_1 = null;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
	private int anInt4472 = 0;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	private int anInt4474 = 0;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_20;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!sda;")
	private final Class303 aClass303_2;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "[Lclient!fk;")
	private final Class76[] aClass76Array1;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!tm;")
	public final Class76_Sub6 aClass76_Sub6_1;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class171(@OriginalArg(0) Class134_Sub2 arg0) {
		this.aClass134_Sub2_20 = arg0;
		this.aClass303_2 = new Class303(arg0);
		this.aClass76Array1 = new Class76[10];
		this.aClass76Array1[1] = new Class76_Sub3(arg0);
		this.aClass76Array1[2] = new Class76_Sub7(arg0, this.aClass303_2);
		this.aClass76Array1[4] = new Class76_Sub8(arg0, this.aClass303_2);
		this.aClass76Array1[5] = new Class76_Sub2(arg0, this.aClass303_2);
		this.aClass76Array1[6] = new Class76_Sub4(arg0);
		this.aClass76Array1[7] = new Class76_Sub1(arg0);
		this.aClass76Array1[3] = this.aClass76_Sub6_1 = new Class76_Sub6(arg0);
		this.aClass76Array1[8] = new Class76_Sub5(arg0, this.aClass303_2);
		this.aClass76Array1[9] = new Class76_Sub9(arg0, this.aClass303_2);
		if (!this.aClass76Array1[8].method7606()) {
			this.aClass76Array1[8] = this.aClass76Array1[4];
		}
		if (!this.aClass76Array1[9].method7606()) {
			this.aClass76Array1[9] = this.aClass76Array1[8];
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Z")
	public boolean method3628() {
		return this.aClass76Array1[3].method7606();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZZIII)V")
	public void method3630(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) boolean local9 = arg1 & this.aClass134_Sub2_20.method6968();
		if (!local9 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg3 = arg4;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt4471) {
			if (this.anInt4471 != 0) {
				this.aClass76Array1[Integer.MAX_VALUE & this.anInt4471].method7610();
			}
			if (arg2 != 0) {
				this.aClass76Array1[arg2 & Integer.MAX_VALUE].method7607(arg0);
				this.aClass76Array1[arg2 & Integer.MAX_VALUE].method7613(arg0);
				this.aClass76Array1[Integer.MAX_VALUE & arg2].method7608(arg4, arg3);
			}
			this.aClass40_1 = null;
			this.anInt4471 = arg2;
			this.anInt4474 = arg4;
			this.anInt4472 = arg3;
		} else if (this.anInt4471 != 0) {
			this.aClass76Array1[this.anInt4471 & Integer.MAX_VALUE].method7613(arg0);
			if (this.anInt4474 != arg4 || this.anInt4472 != arg3) {
				this.aClass76Array1[Integer.MAX_VALUE & this.anInt4471].method7608(arg4, arg3);
				this.anInt4472 = arg3;
				this.anInt4474 = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ip;I)Z")
	public boolean method3632(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4471 == 0) {
			return false;
		}
		if (arg0 != this.aClass40_1) {
			this.aClass76Array1[this.anInt4471 & Integer.MAX_VALUE].method7611(arg1, arg0);
			this.aClass40_1 = arg0;
		}
		return true;
	}
}
