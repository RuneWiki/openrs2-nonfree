import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class374 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	private int anInt10247 = 0;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
	private int anInt10249 = 0;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	private int anInt10250 = 0;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_40;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!lba;")
	private final Class201 aClass201_6;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "[Lclient!es;")
	private final Class34[] aClass34Array1;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!mv;")
	public final Class34_Sub6 aClass34_Sub6_1;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class374(@OriginalArg(0) Class126_Sub3 arg0) {
		this.aClass126_Sub3_40 = arg0;
		this.aClass201_6 = new Class201(arg0);
		this.aClass34Array1 = new Class34[10];
		this.aClass34Array1[1] = new Class34_Sub1(arg0);
		this.aClass34Array1[2] = new Class34_Sub4(arg0, this.aClass201_6);
		this.aClass34Array1[4] = new Class34_Sub5(arg0, this.aClass201_6);
		this.aClass34Array1[5] = new Class34_Sub9(arg0, this.aClass201_6);
		this.aClass34Array1[6] = new Class34_Sub7(arg0);
		this.aClass34Array1[7] = new Class34_Sub2(arg0);
		this.aClass34Array1[3] = this.aClass34_Sub6_1 = new Class34_Sub6(arg0);
		this.aClass34Array1[8] = new Class34_Sub8(arg0, this.aClass201_6);
		this.aClass34Array1[9] = new Class34_Sub3(arg0, this.aClass201_6);
		if (!this.aClass34Array1[8].method8519()) {
			this.aClass34Array1[8] = this.aClass34Array1[4];
		}
		if (!this.aClass34Array1[9].method8519()) {
			this.aClass34Array1[9] = this.aClass34Array1[8];
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z")
	public boolean method8714() {
		return this.aClass34Array1[3].method8519();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIZZI)V")
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass126_Sub3_40.method7016();
		if (!local5 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg1 = arg0;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg3) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt10247) {
			if (this.anInt10247 != 0) {
				this.aClass34Array1[this.anInt10247 & Integer.MAX_VALUE].method8516();
			}
			if (arg2 != 0) {
				this.aClass34Array1[arg2 & Integer.MAX_VALUE].method8521(arg3);
				this.aClass34Array1[Integer.MAX_VALUE & arg2].method8518(arg3);
				this.aClass34Array1[Integer.MAX_VALUE & arg2].method8520(arg0, arg1);
			}
			this.anInt10249 = arg0;
			this.anInt10250 = arg1;
			this.anInt10247 = arg2;
		} else if (this.anInt10247 != 0) {
			this.aClass34Array1[this.anInt10247 & Integer.MAX_VALUE].method8518(arg3);
			if (this.anInt10249 != arg0 || this.anInt10250 != arg1) {
				this.aClass34Array1[Integer.MAX_VALUE & this.anInt10247].method8520(arg0, arg1);
				this.anInt10249 = arg0;
				this.anInt10250 = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!iga;BI)Z")
	public boolean method8717(@OriginalArg(0) Class24 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt10247 == 0) {
			return false;
		} else {
			this.aClass34Array1[this.anInt10247 & Integer.MAX_VALUE].method8522(arg1, arg0);
			return true;
		}
	}
}
