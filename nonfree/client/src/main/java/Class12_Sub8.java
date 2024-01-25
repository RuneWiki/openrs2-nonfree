import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class12_Sub8 extends Class12 {

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub8(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)I")
	public int method2213() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		super.anInt10229 = this.method8468();
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		return super.aClass5_Sub50_31.method7532() == Static599.aClass98_6 && super.aClass5_Sub50_31.method7526() ? 0 : 1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		return 3;
	}
}
