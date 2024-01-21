import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!pg;")
	private final Class59 aClass59_28 = new Class59();

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "Lclient!pg;")
	private final Class59 aClass59_29 = new Class59();

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
	private int anInt1805 = -1;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
	private int anInt1806 = 0;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lclient!bc;")
	@Override
	public Class1_Sub5 method1318() {
		return (Class1_Sub5) this.aClass59_28.method2417();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!bc;)V")
	public synchronized void method1188(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aClass59_28.method2412(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()I")
	@Override
	public int method1312() {
		return 0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tc;)V")
	private void method1189(@OriginalArg(0) Class1_Sub22 arg0) {
		arg0.method3198();
		arg0.method2868();
		@Pc(9) Class1 local9 = this.aClass59_29.aClass1_149.aClass1_207;
		if (local9 == this.aClass59_29.aClass1_149) {
			this.anInt1805 = -1;
		} else {
			this.anInt1805 = ((Class1_Sub22) local9).anInt4202;
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "([III)V")
	private void method1190(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub5 local5 = (Class1_Sub5) this.aClass59_28.method2417(); local5 != null; local5 = (Class1_Sub5) this.aClass59_28.method2424()) {
			local5.method1315(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1316(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1805 < 0) {
				this.method1194(arg0);
				return;
			}
			if (this.anInt1806 + arg0 < this.anInt1805) {
				this.anInt1806 += arg0;
				this.method1194(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1805 - this.anInt1806;
			this.method1194(local29);
			arg0 -= local29;
			this.anInt1806 += local29;
			this.method1193();
			@Pc(50) Class1_Sub22 local50 = (Class1_Sub22) this.aClass59_29.method2417();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2869(this);
				if (local58 < 0) {
					local50.anInt4202 = 0;
					this.method1189(local50);
				} else {
					local50.anInt4202 = local58;
					this.method1192(local50.aClass1_207, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lclient!bc;)V")
	public synchronized void method1191(@OriginalArg(0) Class1_Sub5 arg0) {
		arg0.method3198();
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Lclient!bc;")
	@Override
	public Class1_Sub5 method1314() {
		return (Class1_Sub5) this.aClass59_28.method2424();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!kh;Lclient!tc;)V")
	private void method1192(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub22 arg1) {
		while (arg0 != this.aClass59_29.aClass1_149 && ((Class1_Sub22) arg0).anInt4202 <= arg1.anInt4202) {
			arg0 = arg0.aClass1_207;
		}
		this.aClass59_29.method2414(arg1, arg0);
		this.anInt1805 = ((Class1_Sub22) this.aClass59_29.aClass1_149.aClass1_207).anInt4202;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1313(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1805 < 0) {
				this.method1190(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1806 + arg2 < this.anInt1805) {
				this.anInt1806 += arg2;
				this.method1190(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1805 - this.anInt1806;
			this.method1190(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1806 += local33;
			this.method1193();
			@Pc(60) Class1_Sub22 local60 = (Class1_Sub22) this.aClass59_29.method2417();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2869(this);
				if (local68 < 0) {
					local60.anInt4202 = 0;
					this.method1189(local60);
				} else {
					local60.anInt4202 = local68;
					this.method1192(local60.aClass1_207, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
	private void method1193() {
		if (this.anInt1806 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub22 local8 = (Class1_Sub22) this.aClass59_29.method2417(); local8 != null; local8 = (Class1_Sub22) this.aClass59_29.method2424()) {
			local8.anInt4202 -= this.anInt1806;
		}
		this.anInt1805 -= this.anInt1806;
		this.anInt1806 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	private void method1194(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub5 local5 = (Class1_Sub5) this.aClass59_28.method2417(); local5 != null; local5 = (Class1_Sub5) this.aClass59_28.method2424()) {
			local5.method1316(arg0);
		}
	}
}
