import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class148 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Lclient!wb;")
	private Class10_Sub8 aClass10_Sub8_2;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!wb;")
	public final Class10_Sub8 aClass10_Sub8_1 = new Class10_Sub8();

	static {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray2[local10] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class148() {
		this.aClass10_Sub8_1.aClass10_Sub8_8 = this.aClass10_Sub8_1;
		this.aClass10_Sub8_1.aClass10_Sub8_7 = this.aClass10_Sub8_1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public void method3325() {
		while (true) {
			@Pc(5) Class10_Sub8 local5 = this.aClass10_Sub8_1.aClass10_Sub8_8;
			if (local5 == this.aClass10_Sub8_1) {
				this.aClass10_Sub8_2 = null;
				return;
			}
			local5.method4608();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)Lclient!wb;")
	public Class10_Sub8 method3326() {
		@Pc(14) Class10_Sub8 local14 = this.aClass10_Sub8_1.aClass10_Sub8_8;
		if (this.aClass10_Sub8_1 == local14) {
			this.aClass10_Sub8_2 = null;
			return null;
		} else {
			this.aClass10_Sub8_2 = local14.aClass10_Sub8_8;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Lclient!wb;")
	public Class10_Sub8 method3328() {
		@Pc(12) Class10_Sub8 local12 = this.aClass10_Sub8_2;
		if (this.aClass10_Sub8_1 == local12) {
			this.aClass10_Sub8_2 = null;
			return null;
		} else {
			this.aClass10_Sub8_2 = local12.aClass10_Sub8_8;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!wb;)V")
	public void method3329(@OriginalArg(1) Class10_Sub8 arg0) {
		if (arg0.aClass10_Sub8_7 != null) {
			arg0.method4608();
		}
		arg0.aClass10_Sub8_8 = this.aClass10_Sub8_1;
		arg0.aClass10_Sub8_7 = this.aClass10_Sub8_1.aClass10_Sub8_7;
		arg0.aClass10_Sub8_7.aClass10_Sub8_8 = arg0;
		arg0.aClass10_Sub8_8.aClass10_Sub8_7 = arg0;
	}
}
