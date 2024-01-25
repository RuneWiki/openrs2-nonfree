import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class11_Sub12 extends Class11 {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	static {
		for (@Pc(73) int local73 = 0; local73 < 100; local73++) {
			aRectangleArray1[local73] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub12(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return super.aClass2_Sub30_32.method2983() == Static395.aClass150_8 && super.aClass2_Sub30_32.method2991() ? 0 : 1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I")
	public int method2753() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		super.anInt11012 = this.method9617();
	}
}
