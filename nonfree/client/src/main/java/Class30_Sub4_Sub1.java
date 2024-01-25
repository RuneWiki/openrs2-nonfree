import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class30_Sub4_Sub1 extends Class30_Sub4 implements Interface19 {

	@OriginalMember(owner = "client!jda", name = "E", descriptor = "Lclient!fba;")
	public Class30_Sub4 aClass30_Sub4_3;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(IIIIILclient!fba;)V")
	public Class30_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class30_Sub4 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static333.method5314(arg0, arg1));
		this.aClass30_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7920() {
		return false;
	}

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "(I)I")
	@Override
	public int method7910() {
		return 0;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
	@Override
	public void method7914() {
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7916(@OriginalArg(1) Class42 arg0) {
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7921(@OriginalArg(1) Class42 arg0) {
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	@Override
	public Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)I")
	@Override
	public int method7919() {
		return 0;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return this.aClass30_Sub4_3.method7906(arg0);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)I")
	@Override
	public int method7915() {
		return 0;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)I")
	@Override
	public int method7918() {
		return 0;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		return null;
	}
}
