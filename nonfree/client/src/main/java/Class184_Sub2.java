import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class184_Sub2 extends Class184 {

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[16384];

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "[F")
	public static final float[] aFloatArray47 = new float[16384];

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!xa;")
	private Class4 aClass4_21;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	private int anInt6960;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Lclient!pq;")
	private final Class251 aClass251_114;

	static {
		@Pc(11) double local11 = 3.834951969714103E-4D;
		for (@Pc(13) int local13 = 0; local13 < 16384; local13++) {
			aFloatArray47[local13] = (float) Math.sin((double) local13 * local11);
			aFloatArray46[local13] = (float) Math.cos(local11 * (double) local13);
		}
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!pq;Lclient!qu;)V")
	public Class184_Sub2(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class10_Sub2 arg1) {
		super(arg1);
		this.aClass251_114 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	@Override
	public void method6567() {
		this.aClass4_21 = Static96.method1502(this.aClass251_114.method5855(((Class10_Sub2) super.aClass10_4).anInt7539));
		this.method6565();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6566() {
		return this.aClass251_114.method5859(((Class10_Sub2) super.aClass10_4).anInt7539);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method6570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static176.aClass121_5.method7127(arg0 - 2, arg1, super.aClass10_4.anInt7621 + 4, super.aClass10_4.anInt7623 + 2, ((Class10_Sub2) super.aClass10_4).anInt7540, 0);
		Static176.aClass121_5.method7127(arg0 - 1, arg1 - -1, super.aClass10_4.anInt7621 + 2, super.aClass10_4.anInt7623, 0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method6569(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		this.anInt6960 = Static309.anInt5563;
		@Pc(24) int local24 = super.aClass10_4.anInt7621 * Static309.anInt5563 / 100;
		@Pc(27) int[] local27 = new int[4];
		Static176.aClass121_5.A(local27);
		Static176.aClass121_5.ca(arg0, arg1 + 2, local24 + arg0, arg1 + super.aClass10_4.anInt7623);
		this.aClass4_21.method6516(arg0, arg1 + 2, super.aClass10_4.anInt7621, super.aClass10_4.anInt7623);
		Static176.aClass121_5.ca(local27[0], local27[1], local27[2], local27[3]);
	}
}
