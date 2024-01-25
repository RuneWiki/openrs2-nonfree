import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class6_Sub2_Sub9 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ifa", name = "L", descriptor = "I")
	public int anInt4774 = 12800;

	@OriginalMember(owner = "client!ifa", name = "F", descriptor = "I")
	public int anInt4777 = -1;

	@OriginalMember(owner = "client!ifa", name = "x", descriptor = "I")
	public int anInt4779 = -1;

	@OriginalMember(owner = "client!ifa", name = "v", descriptor = "I")
	public int anInt4770 = 0;

	@OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
	public int anInt4767 = 12800;

	@OriginalMember(owner = "client!ifa", name = "u", descriptor = "Z")
	public boolean aBoolean364 = true;

	@OriginalMember(owner = "client!ifa", name = "A", descriptor = "I")
	public int anInt4782 = 0;

	@OriginalMember(owner = "client!ifa", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString49;

	@OriginalMember(owner = "client!ifa", name = "J", descriptor = "I")
	public final int anInt4780;

	@OriginalMember(owner = "client!ifa", name = "D", descriptor = "Ljava/lang/String;")
	public final String aString48;

	@OriginalMember(owner = "client!ifa", name = "O", descriptor = "I")
	public final int anInt4776;

	@OriginalMember(owner = "client!ifa", name = "z", descriptor = "Lclient!tf;")
	public final Class340 aClass340_33;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString49 = arg2;
		this.anInt4779 = arg4;
		this.anInt4777 = arg6;
		this.anInt4780 = arg0;
		this.aString48 = arg1;
		this.anInt4776 = arg3;
		this.aBoolean364 = arg5;
		if (this.anInt4777 == 255) {
			this.anInt4777 = 0;
		}
		this.aClass340_33 = new Class340();
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V")
	public void method4377() {
		this.anInt4782 = 0;
		this.anInt4770 = 0;
		this.anInt4767 = 12800;
		this.anInt4774 = 12800;
		for (@Pc(35) Class6_Sub38 local35 = (Class6_Sub38) this.aClass340_33.method8124(); local35 != null; local35 = (Class6_Sub38) this.aClass340_33.method8134()) {
			if (local35.anInt6738 < this.anInt4774) {
				this.anInt4774 = local35.anInt6738;
			}
			if (this.anInt4770 < local35.anInt6749) {
				this.anInt4770 = local35.anInt6749;
			}
			if (local35.anInt6743 < this.anInt4767) {
				this.anInt4767 = local35.anInt6743;
			}
			if (this.anInt4782 < local35.anInt6752) {
				this.anInt4782 = local35.anInt6752;
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III[I)Z")
	public boolean method4378(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class6_Sub38 local17 = (Class6_Sub38) this.aClass340_33.method8124(); local17 != null; local17 = (Class6_Sub38) this.aClass340_33.method8134()) {
			if (local17.method6002(arg1, arg0)) {
				local17.method6001(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "([IIIBI)Z")
	public boolean method4379(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(19) Class6_Sub38 local19 = (Class6_Sub38) this.aClass340_33.method8124(); local19 != null; local19 = (Class6_Sub38) this.aClass340_33.method8134()) {
			if (local19.method5996(arg3, arg2, arg1)) {
				local19.method6001(arg0, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "([IZII)Z")
	public boolean method4380(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(20) Class6_Sub38 local20 = (Class6_Sub38) this.aClass340_33.method8124(); local20 != null; local20 = (Class6_Sub38) this.aClass340_33.method8134()) {
			if (local20.method6000(arg1, arg2)) {
				local20.method5999(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)Z")
	public boolean method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(19) Class6_Sub38 local19 = (Class6_Sub38) this.aClass340_33.method8124(); local19 != null; local19 = (Class6_Sub38) this.aClass340_33.method8134()) {
			if (local19.method6002(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}
}
