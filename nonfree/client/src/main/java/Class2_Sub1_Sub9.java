import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jea", name = "A", descriptor = "I")
	public int anInt5166 = 12800;

	@OriginalMember(owner = "client!jea", name = "E", descriptor = "I")
	public int anInt5168 = 0;

	@OriginalMember(owner = "client!jea", name = "N", descriptor = "I")
	public int anInt5175 = 12800;

	@OriginalMember(owner = "client!jea", name = "J", descriptor = "I")
	public int anInt5172 = 0;

	@OriginalMember(owner = "client!jea", name = "P", descriptor = "Z")
	public boolean aBoolean387 = true;

	@OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
	public int anInt5170 = -1;

	@OriginalMember(owner = "client!jea", name = "Q", descriptor = "I")
	public int anInt5177 = -1;

	@OriginalMember(owner = "client!jea", name = "D", descriptor = "Ljava/lang/String;")
	public final String aString63;

	@OriginalMember(owner = "client!jea", name = "K", descriptor = "I")
	public final int anInt5173;

	@OriginalMember(owner = "client!jea", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!jea", name = "L", descriptor = "I")
	public final int anInt5174;

	@OriginalMember(owner = "client!jea", name = "M", descriptor = "Lclient!ow;")
	public final Class271 aClass271_26;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString63 = arg1;
		this.anInt5173 = arg0;
		this.aString64 = arg2;
		this.anInt5177 = arg6;
		this.anInt5174 = arg3;
		this.anInt5170 = arg4;
		this.aBoolean387 = arg5;
		if (this.anInt5177 == 255) {
			this.anInt5177 = 0;
		}
		this.aClass271_26 = new Class271();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B[III)Z")
	public boolean method4702(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) Class2_Sub29 local17 = (Class2_Sub29) this.aClass271_26.method7177(); local17 != null; local17 = (Class2_Sub29) this.aClass271_26.method7175()) {
			if (local17.method3919(arg2, arg1)) {
				local17.method3921(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(BII[II)Z")
	public boolean method4703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class2_Sub29 local16 = (Class2_Sub29) this.aClass271_26.method7177(); local16 != null; local16 = (Class2_Sub29) this.aClass271_26.method7175()) {
			if (local16.method3916(arg0, arg3, arg1)) {
				local16.method3922(arg0, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)Z")
	public boolean method4704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class2_Sub29 local17 = (Class2_Sub29) this.aClass271_26.method7177(); local17 != null; local17 = (Class2_Sub29) this.aClass271_26.method7175()) {
			if (local17.method3918(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
	public void method4705() {
		this.anInt5166 = 12800;
		this.anInt5172 = 0;
		this.anInt5168 = 0;
		this.anInt5175 = 12800;
		for (@Pc(28) Class2_Sub29 local28 = (Class2_Sub29) this.aClass271_26.method7177(); local28 != null; local28 = (Class2_Sub29) this.aClass271_26.method7175()) {
			if (this.anInt5172 < local28.anInt4300) {
				this.anInt5172 = local28.anInt4300;
			}
			if (this.anInt5166 > local28.anInt4303) {
				this.anInt5166 = local28.anInt4303;
			}
			if (local28.anInt4298 < this.anInt5175) {
				this.anInt5175 = local28.anInt4298;
			}
			if (this.anInt5168 < local28.anInt4293) {
				this.anInt5168 = local28.anInt4293;
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[IBI)Z")
	public boolean method4706(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub29 local11 = (Class2_Sub29) this.aClass271_26.method7177(); local11 != null; local11 = (Class2_Sub29) this.aClass271_26.method7175()) {
			if (local11.method3918(arg0, arg2)) {
				local11.method3922(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}
}
