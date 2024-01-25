import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class15_Sub4_Sub3 extends Class15_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "Lclient!ti;")
	public Class15_Sub4 aClass15_Sub4_3;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIILclient!ti;)V")
	public Class15_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class15_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static469.method6538(arg0, arg1));
		this.aClass15_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return false;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return 0;
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return this.aClass15_Sub4_3.method7156(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)I")
	@Override
	public int method7166() {
		return 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		return null;
	}
}
