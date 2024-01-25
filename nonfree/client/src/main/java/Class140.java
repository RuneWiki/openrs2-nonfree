import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class140 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	private int anInt4064 = 0;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	private int anInt4066 = 0;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	private int anInt4068 = 0;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_14;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!go;")
	private final Class130 aClass130_3;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[Lclient!od;")
	private final Class33[] aClass33Array1;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!pk;")
	public final Class33_Sub6 aClass33_Sub6_1;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class140(@OriginalArg(0) Class137_Sub3 arg0) {
		this.aClass137_Sub3_14 = arg0;
		this.aClass130_3 = new Class130(arg0);
		this.aClass33Array1 = new Class33[10];
		this.aClass33Array1[1] = new Class33_Sub3(arg0);
		this.aClass33Array1[2] = new Class33_Sub2(arg0, this.aClass130_3);
		this.aClass33Array1[4] = new Class33_Sub9(arg0, this.aClass130_3);
		this.aClass33Array1[5] = new Class33_Sub5(arg0, this.aClass130_3);
		this.aClass33Array1[6] = new Class33_Sub4(arg0);
		this.aClass33Array1[7] = new Class33_Sub7(arg0);
		this.aClass33Array1[3] = this.aClass33_Sub6_1 = new Class33_Sub6(arg0);
		this.aClass33Array1[8] = new Class33_Sub1(arg0, this.aClass130_3);
		this.aClass33Array1[9] = new Class33_Sub8(arg0, this.aClass130_3);
		if (!this.aClass33Array1[8].method8846()) {
			this.aClass33Array1[8] = this.aClass33Array1[4];
		}
		if (!this.aClass33Array1[9].method8846()) {
			this.aClass33Array1[9] = this.aClass33Array1[8];
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!dca;II)Z")
	public boolean method3371(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4068 == 0) {
			return false;
		} else {
			this.aClass33Array1[this.anInt4068 & Integer.MAX_VALUE].method8851(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
	public boolean method3372() {
		return this.aClass33Array1[3].method8846();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZIIZ)V")
	public void method3373(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(5) boolean local5 = arg1 & this.aClass137_Sub3_14.method7883();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg3 = arg2;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg4) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt4068) {
			if (this.anInt4068 != 0) {
				this.aClass33Array1[this.anInt4068 & Integer.MAX_VALUE].method8848();
			}
			if (arg0 != 0) {
				this.aClass33Array1[Integer.MAX_VALUE & arg0].method8854(arg4);
				this.aClass33Array1[arg0 & Integer.MAX_VALUE].method8847(arg4);
				this.aClass33Array1[Integer.MAX_VALUE & arg0].method8849(arg2, arg3);
			}
			this.anInt4068 = arg0;
			this.anInt4066 = arg2;
			this.anInt4064 = arg3;
		} else if (this.anInt4068 != 0) {
			this.aClass33Array1[Integer.MAX_VALUE & this.anInt4068].method8847(arg4);
			if (this.anInt4066 != arg2 || arg3 != this.anInt4064) {
				this.aClass33Array1[Integer.MAX_VALUE & this.anInt4068].method8849(arg2, arg3);
				this.anInt4064 = arg3;
				this.anInt4066 = arg2;
			}
		}
	}
}
