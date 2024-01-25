import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
	public int anInt5671 = 12800;

	@OriginalMember(owner = "client!qr", name = "H", descriptor = "Z")
	public boolean aBoolean402 = true;

	@OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
	public int anInt5679 = 0;

	@OriginalMember(owner = "client!qr", name = "O", descriptor = "I")
	public int anInt5683 = 0;

	@OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
	public int anInt5682 = 12800;

	@OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
	public int anInt5675 = -1;

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
	public int anInt5672 = -1;

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
	public final int anInt5676;

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "I")
	public final int anInt5673;

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString55;

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!qr", name = "E", descriptor = "Lclient!oe;")
	public final Class181 aClass181_55;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5676 = arg0;
		this.aBoolean402 = arg5;
		this.anInt5675 = arg4;
		this.anInt5673 = arg3;
		this.aString55 = arg1;
		this.aString56 = arg2;
		this.anInt5672 = arg6;
		if (this.anInt5672 == 255) {
			this.anInt5672 = 0;
		}
		this.aClass181_55 = new Class181();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	public void method4712() {
		this.anInt5679 = 0;
		this.anInt5683 = 0;
		this.anInt5671 = 12800;
		this.anInt5682 = 12800;
		for (@Pc(23) Class1_Sub21 local23 = (Class1_Sub21) this.aClass181_55.method4112(); local23 != null; local23 = (Class1_Sub21) this.aClass181_55.method4104()) {
			if (local23.anInt2634 > this.anInt5679) {
				this.anInt5679 = local23.anInt2634;
			}
			if (local23.anInt2631 < this.anInt5682) {
				this.anInt5682 = local23.anInt2631;
			}
			if (local23.anInt2625 > this.anInt5683) {
				this.anInt5683 = local23.anInt2625;
			}
			if (local23.anInt2629 < this.anInt5671) {
				this.anInt5671 = local23.anInt2629;
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I[IIB)Z")
	public boolean method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(16) Class1_Sub21 local16 = (Class1_Sub21) this.aClass181_55.method4112(); local16 != null; local16 = (Class1_Sub21) this.aClass181_55.method4104()) {
			if (local16.method2284(arg2, arg0)) {
				local16.method2280(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II[III)Z")
	public boolean method4715(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub21 local15 = (Class1_Sub21) this.aClass181_55.method4112(); local15 != null; local15 = (Class1_Sub21) this.aClass181_55.method4104()) {
			if (local15.method2286(arg2, arg0, arg3)) {
				local15.method2280(arg3, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)Z")
	public boolean method4716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(9) Class1_Sub21 local9 = (Class1_Sub21) this.aClass181_55.method4112(); local9 != null; local9 = (Class1_Sub21) this.aClass181_55.method4104()) {
			if (local9.method2284(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([IIIZ)Z")
	public boolean method4717(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(9) Class1_Sub21 local9 = (Class1_Sub21) this.aClass181_55.method4112(); local9 != null; local9 = (Class1_Sub21) this.aClass181_55.method4104()) {
			if (local9.method2279(arg1, arg2)) {
				local9.method2281(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
