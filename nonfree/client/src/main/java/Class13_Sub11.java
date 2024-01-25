import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class13_Sub11 extends Class13 {

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "Lclient!cda;")
	private final Class61 aClass61_8;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "Lclient!rda;")
	private final Class57_Sub3_Sub1 aClass57_Sub3_Sub1_11;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Lclient!de;")
	private final Class84 aClass84_5;

	static {
		for (@Pc(109) int local109 = 0; local109 < 100; local109++) {
			aRectangleArray2[local109] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!rda;Lclient!la;Lclient!cda;)V")
	public Class13_Sub11(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class61 arg2) {
		super(arg0);
		this.aClass61_8 = arg2;
		this.aClass57_Sub3_Sub1_11 = arg0;
		if (arg1 != null && this.aClass61_8.method1092() && this.aClass57_Sub3_Sub1_11.aBoolean650) {
			this.aClass84_5 = Static283.method4153(arg1.method4999("transparent_water", "gl"), this.aClass57_Sub3_Sub1_11);
		} else {
			this.aClass84_5 = null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass84_5.anInt1604);
		OpenGL.glEnable(34336);
		super.aClass57_Sub3_21.method7866(0, Static79.aClass312_2);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
		super.aClass57_Sub3_21.method7733(Static11.aClass34_6, Static362.aClass34_172);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return this.aClass84_5 != null;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
		super.aClass57_Sub3_21.method7866(0, Static57.aClass312_1);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass61_8.aBoolean95) {
			@Pc(12) float local12 = (float) (super.aClass57_Sub3_21.anInt9168 % 4000) / 4000.0F;
			super.aClass57_Sub3_21.method7813(this.aClass61_8.anInterface19_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local12, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(38) int local38 = super.aClass57_Sub3_21.anInt9168 % 4000 * 16 / 4000;
			super.aClass57_Sub3_21.method7813(this.aClass61_8.anInterface26Array2[local38]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
