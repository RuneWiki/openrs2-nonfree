import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class127_Sub2 extends Class127 implements Interface10 {

	@OriginalMember(owner = "client!qr", name = "E", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[16384];

	@OriginalMember(owner = "client!qr", name = "J", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[16384];

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "B")
	private byte aByte99;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray67[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray66[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!tk;Z)V")
	public Class127_Sub2(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method8447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte99 = (byte) arg0;
		super.method6788(arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8448() {
		return super.method6784(super.aClass13_Sub3_Sub1_9.aMapBuffer2);
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)I")
	public int method6797() {
		return this.aByte99;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)I")
	@Override
	public int method8445() {
		return super.method8445();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte99 = (byte) arg0;
		super.method7407(arg1);
		return true;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8449() {
		return super.method6791(super.aClass13_Sub3_Sub1_9.aMapBuffer2);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	@Override
	public void method8446() {
		super.method8446();
	}
}
