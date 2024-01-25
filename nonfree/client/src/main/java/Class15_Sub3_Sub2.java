import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public final class Class15_Sub3_Sub2 extends Class15_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!haa", name = "I", descriptor = "Lclient!es;")
	public Class15_Sub3 aClass15_Sub3_1;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(IIILclient!es;)V")
	public Class15_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub3 arg3) {
		super(arg0, arg1, arg2, arg3.aShort99, false, false);
		this.aClass15_Sub3_1 = arg3;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return false;
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return 0;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return 0;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return 0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return this.aClass15_Sub3_1.method7156(arg0);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
	}
}
