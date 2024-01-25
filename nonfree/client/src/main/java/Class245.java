import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class245 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!vd;")
	private Class81 aClass81_1 = null;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
	private int anInt6950 = 0;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	private int anInt6951 = 0;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_41;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "Lclient!ja;")
	private final Class114 aClass114_4;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[Lclient!io;")
	private final Class87[] aClass87Array1;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class245(@OriginalArg(0) Class48_Sub2 arg0) {
		this.aClass48_Sub2_41 = arg0;
		this.aClass114_4 = new Class114(arg0);
		this.aClass87Array1 = new Class87[9];
		this.aClass87Array1[1] = new Class87_Sub6(arg0);
		this.aClass87Array1[2] = new Class87_Sub7(arg0, this.aClass114_4);
		this.aClass87Array1[4] = new Class87_Sub3(arg0, this.aClass114_4);
		this.aClass87Array1[5] = new Class87_Sub4(arg0, this.aClass114_4);
		this.aClass87Array1[6] = new Class87_Sub2(arg0);
		this.aClass87Array1[7] = new Class87_Sub1(arg0);
		this.aClass87Array1[3] = new Class87_Sub5(arg0);
		this.aClass87Array1[8] = this.aClass87Array1[4];
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z")
	public boolean method5991() {
		return this.aClass87Array1[3].method5873();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZZIZ)V")
	public void method5992(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass48_Sub2_41.method2473();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt6951 != arg2) {
			if (this.anInt6951 != 0) {
				this.aClass87Array1[Integer.MAX_VALUE & this.anInt6951].method5874();
			}
			if (arg2 != 0) {
				this.aClass87Array1[arg2 & Integer.MAX_VALUE].method5872(arg1);
				this.aClass87Array1[Integer.MAX_VALUE & arg2].method5875(arg1);
			}
			this.anInt6950 = Integer.MIN_VALUE;
			this.aClass81_1 = null;
			this.anInt6951 = arg2;
		} else if (this.anInt6951 != 0) {
			this.aClass87Array1[this.anInt6951 & Integer.MAX_VALUE].method5875(arg1);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZ)V")
	public void method5993(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (this.anInt6951 != 0 & (arg1 | arg0 != this.anInt6950)) {
			this.aClass87Array1[Integer.MAX_VALUE & this.anInt6951].method5871(arg0);
			this.anInt6950 = arg0;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!vd;)Z")
	public boolean method5994(@OriginalArg(1) Class81 arg0) {
		if (this.anInt6951 == 0) {
			return false;
		}
		if (arg0 != this.aClass81_1) {
			this.aClass87Array1[Integer.MAX_VALUE & this.anInt6951].method5870(arg0);
			this.aClass81_1 = arg0;
		}
		return true;
	}
}
