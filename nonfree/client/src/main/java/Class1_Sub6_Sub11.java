import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class1_Sub6_Sub11 extends Class1_Sub6 {

	@OriginalMember(owner = "client!oq", name = "I", descriptor = "I")
	public int anInt6664 = 12800;

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
	public int anInt6658 = -1;

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
	public int anInt6654 = 0;

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "I")
	public int anInt6657 = -1;

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "I")
	public int anInt6659 = 12800;

	@OriginalMember(owner = "client!oq", name = "D", descriptor = "I")
	public int anInt6660 = 0;

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "Z")
	public boolean aBoolean536 = true;

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!oq", name = "N", descriptor = "I")
	public final int anInt6669;

	@OriginalMember(owner = "client!oq", name = "Q", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
	public final int anInt6656;

	@OriginalMember(owner = "client!oq", name = "O", descriptor = "Lclient!wba;")
	public final Class353 aClass353_55;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub6_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6658 = arg4;
		this.aString66 = arg1;
		this.anInt6669 = arg0;
		this.aString67 = arg2;
		this.anInt6656 = arg3;
		this.anInt6657 = arg6;
		this.aBoolean536 = arg5;
		if (this.anInt6657 == 255) {
			this.anInt6657 = 0;
		}
		this.aClass353_55 = new Class353();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III[I)Z")
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class1_Sub46 local11 = (Class1_Sub46) this.aClass353_55.method7677(); local11 != null; local11 = (Class1_Sub46) this.aClass353_55.method7687()) {
			if (local11.method7222(arg1, arg0)) {
				local11.method7224(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B[III)Z")
	public boolean method5338(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class1_Sub46 local16 = (Class1_Sub46) this.aClass353_55.method7677(); local16 != null; local16 = (Class1_Sub46) this.aClass353_55.method7687()) {
			if (local16.method7225(arg1, arg2)) {
				local16.method7223(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII[I)Z")
	public boolean method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(15) Class1_Sub46 local15 = (Class1_Sub46) this.aClass353_55.method7677(); local15 != null; local15 = (Class1_Sub46) this.aClass353_55.method7687()) {
			if (local15.method7226(arg0, arg2, arg1)) {
				local15.method7223(arg3, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(B)V")
	public void method5340() {
		this.anInt6660 = 0;
		this.anInt6664 = 12800;
		this.anInt6654 = 0;
		this.anInt6659 = 12800;
		for (@Pc(29) Class1_Sub46 local29 = (Class1_Sub46) this.aClass353_55.method7677(); local29 != null; local29 = (Class1_Sub46) this.aClass353_55.method7687()) {
			if (this.anInt6654 < local29.anInt8831) {
				this.anInt6654 = local29.anInt8831;
			}
			if (this.anInt6660 < local29.anInt8827) {
				this.anInt6660 = local29.anInt8827;
			}
			if (local29.anInt8822 < this.anInt6664) {
				this.anInt6664 = local29.anInt8822;
			}
			if (local29.anInt8826 < this.anInt6659) {
				this.anInt6659 = local29.anInt8826;
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZI)Z")
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class1_Sub46 local16 = (Class1_Sub46) this.aClass353_55.method7677(); local16 != null; local16 = (Class1_Sub46) this.aClass353_55.method7687()) {
			if (local16.method7225(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}
}
