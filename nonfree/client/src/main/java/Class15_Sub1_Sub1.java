import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class15_Sub1_Sub1 extends Class15_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!al", name = "H", descriptor = "Lclient!ao;")
	public Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIILclient!ao;)V")
	public Class15_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class15_Sub1 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static423.method6075(arg0, arg1));
		this.aClass15_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return 0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return 0;
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return false;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return 0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return this.aClass15_Sub1_1.method6854(arg0);
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)I")
	@Override
	public int method6155() {
		return 0;
	}
}
