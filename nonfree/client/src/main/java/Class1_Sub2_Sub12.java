import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
	public int anInt3527 = 0;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
	public int anInt3523 = 12800;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
	public int anInt3524 = 0;

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
	public int anInt3530 = -1;

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
	public int anInt3531 = -1;

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "Z")
	public boolean aBoolean210 = true;

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
	public int anInt3534 = 12800;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
	public final int anInt3520;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString22;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
	public final int anInt3525;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "Lclient!wo;")
	public final Class266 aClass266_30;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub2_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3530 = arg4;
		this.anInt3520 = arg0;
		this.aString23 = arg2;
		this.aBoolean210 = arg5;
		this.aString22 = arg1;
		this.anInt3525 = arg3;
		this.anInt3531 = arg6;
		if (this.anInt3531 == 255) {
			this.anInt3531 = 0;
		}
		this.aClass266_30 = new Class266();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[IBI)Z")
	public boolean method2961(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class1_Sub37 local16 = (Class1_Sub37) this.aClass266_30.method6000(); local16 != null; local16 = (Class1_Sub37) this.aClass266_30.method5994()) {
			if (local16.method4600(arg2, arg0)) {
				local16.method4606(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIII)Z")
	public boolean method2962(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class1_Sub37 local19 = (Class1_Sub37) this.aClass266_30.method6000(); local19 != null; local19 = (Class1_Sub37) this.aClass266_30.method5994()) {
			if (local19.method4601(arg1, arg2)) {
				local19.method4604(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
	public void method2963() {
		this.anInt3523 = 12800;
		this.anInt3534 = 12800;
		this.anInt3524 = 0;
		this.anInt3527 = 0;
		for (@Pc(23) Class1_Sub37 local23 = (Class1_Sub37) this.aClass266_30.method6000(); local23 != null; local23 = (Class1_Sub37) this.aClass266_30.method5994()) {
			if (local23.anInt5732 < this.anInt3534) {
				this.anInt3534 = local23.anInt5732;
			}
			if (local23.anInt5724 < this.anInt3523) {
				this.anInt3523 = local23.anInt5724;
			}
			if (this.anInt3527 < local23.anInt5725) {
				this.anInt3527 = local23.anInt5725;
			}
			if (this.anInt3524 < local23.anInt5728) {
				this.anInt3524 = local23.anInt5728;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Z")
	public boolean method2965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class1_Sub37 local16 = (Class1_Sub37) this.aClass266_30.method6000(); local16 != null; local16 = (Class1_Sub37) this.aClass266_30.method5994()) {
			if (local16.method4600(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII[I)Z")
	public boolean method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(16) Class1_Sub37 local16 = (Class1_Sub37) this.aClass266_30.method6000(); local16 != null; local16 = (Class1_Sub37) this.aClass266_30.method5994()) {
			if (local16.method4599(arg0, arg2, arg1)) {
				local16.method4606(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}
}
