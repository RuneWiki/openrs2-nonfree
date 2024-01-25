import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class15_Sub2_Sub1 extends Class15_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "Lclient!bt;")
	public Class15_Sub2 aClass15_Sub2_1;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(IIIIIIIIIILclient!bt;)V")
	public Class15_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class15_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static325.method5012(arg0, arg1));
		this.aClass15_Sub2_1 = arg10;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
	}

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "(I)I")
	@Override
	public int method7123() {
		return 0;
	}

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return 0;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return this.aClass15_Sub2_1.method7156(arg0);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return 0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return 0;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return false;
	}
}
