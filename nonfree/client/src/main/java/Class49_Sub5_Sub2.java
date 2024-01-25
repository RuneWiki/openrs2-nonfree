import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class49_Sub5_Sub2 extends Class49_Sub5 implements Interface18 {

	@OriginalMember(owner = "client!qk", name = "C", descriptor = "Lclient!vh;")
	public Class49_Sub5 aClass49_Sub5_1;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IIILclient!vh;)V")
	public Class49_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49_Sub5 arg3) {
		super(arg0, arg1, arg2, arg3.aShort126, false, false);
		this.aClass49_Sub5_1 = arg3;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return 0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return false;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return 0;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return this.aClass49_Sub5_1.method7460(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return 0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return false;
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
	}
}
