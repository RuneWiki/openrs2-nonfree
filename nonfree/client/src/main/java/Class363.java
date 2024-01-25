import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class363 {

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	private int anInt10544 = 0;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
	private int anInt10546 = 0;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!jo;")
	private Class3 aClass3_1 = null;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	private int anInt10543 = 0;

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_44;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "Lclient!ul;")
	private final Class330 aClass330_6;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "[Lclient!raa;")
	private final Class105[] aClass105Array1;

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "Lclient!nca;")
	public final Class105_Sub5 aClass105_Sub5_1;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class363(@OriginalArg(0) Class7_Sub2 arg0) {
		this.aClass7_Sub2_44 = arg0;
		this.aClass330_6 = new Class330(arg0);
		this.aClass105Array1 = new Class105[10];
		this.aClass105Array1[1] = new Class105_Sub6(arg0);
		this.aClass105Array1[2] = new Class105_Sub7(arg0, this.aClass330_6);
		this.aClass105Array1[4] = new Class105_Sub4(arg0, this.aClass330_6);
		this.aClass105Array1[5] = new Class105_Sub8(arg0, this.aClass330_6);
		this.aClass105Array1[6] = new Class105_Sub3(arg0);
		this.aClass105Array1[7] = new Class105_Sub9(arg0);
		this.aClass105Array1[3] = this.aClass105_Sub5_1 = new Class105_Sub5(arg0);
		this.aClass105Array1[8] = new Class105_Sub2(arg0, this.aClass330_6);
		this.aClass105Array1[9] = new Class105_Sub1(arg0, this.aClass330_6);
		if (!this.aClass105Array1[8].method7385()) {
			this.aClass105Array1[8] = this.aClass105Array1[4];
		}
		if (!this.aClass105Array1[9].method7385()) {
			this.aClass105Array1[9] = this.aClass105Array1[8];
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)Z")
	public boolean method8214() {
		return this.aClass105Array1[3].method7385();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZZIIIZ)V")
	public void method8215(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(5) boolean local5 = arg0 & this.aClass7_Sub2_44.method7803();
		if (!local5 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg2 = arg3;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg4) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt10544) {
			if (this.anInt10544 != 0) {
				this.aClass105Array1[this.anInt10544 & Integer.MAX_VALUE].method7381();
			}
			if (arg1 != 0) {
				this.aClass105Array1[arg1 & Integer.MAX_VALUE].method7382(arg4);
				this.aClass105Array1[Integer.MAX_VALUE & arg1].method7390(arg4);
				this.aClass105Array1[arg1 & Integer.MAX_VALUE].method7387(arg2, arg3);
			}
			this.aClass3_1 = null;
			this.anInt10543 = arg2;
			this.anInt10546 = arg3;
			this.anInt10544 = arg1;
		} else if (this.anInt10544 != 0) {
			this.aClass105Array1[this.anInt10544 & Integer.MAX_VALUE].method7390(arg4);
			if (this.anInt10546 != arg3 || arg2 != this.anInt10543) {
				this.aClass105Array1[Integer.MAX_VALUE & this.anInt10544].method7387(arg2, arg3);
				this.anInt10546 = arg3;
				this.anInt10543 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZILclient!jo;)Z")
	public boolean method8216(@OriginalArg(1) int arg0, @OriginalArg(2) Class3 arg1) {
		if (this.anInt10544 == 0) {
			return false;
		}
		if (arg1 != this.aClass3_1) {
			this.aClass105Array1[this.anInt10544 & Integer.MAX_VALUE].method7388(arg0, arg1);
			this.aClass3_1 = arg1;
		}
		return true;
	}
}
