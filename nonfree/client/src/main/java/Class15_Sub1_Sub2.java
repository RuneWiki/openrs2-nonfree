import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public final class Class15_Sub1_Sub2 extends Class15_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!jaa", name = "H", descriptor = "Lclient!al;")
	public Class15_Sub1 aClass15_Sub1_3;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(IIIIILclient!al;)V")
	public Class15_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class15_Sub1 arg5) {
		super(arg2, arg3, arg4, Static395.method5731(arg0, arg1));
		this.aClass15_Sub1_3 = arg5;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)I")
	@Override
	public int method7175() {
		return 0;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
	@Override
	public void method7172() {
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return this.aClass15_Sub1_3.method7156(arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)I")
	@Override
	public int method7171() {
		return 0;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7170(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7173() {
		return false;
	}

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class90 arg0) {
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)I")
	@Override
	public int method7176() {
		return 0;
	}
}
