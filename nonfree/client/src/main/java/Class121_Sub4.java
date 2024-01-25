import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class121_Sub4 extends Class121 {

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Lclient!dma;")
	private final Class76 aClass76_4;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "Lclient!de;")
	private final Class67_Sub1_Sub1 aClass67_Sub1_Sub1_5;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!jagdx/IDirect3DVertexShader;")
	private final IDirect3DVertexShader anIDirect3DVertexShader2;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!de;Lclient!lb;Lclient!dma;)V")
	public Class121_Sub4(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class76 arg2) {
		super(arg0);
		this.aClass76_4 = arg2;
		this.aClass67_Sub1_Sub1_5 = arg0;
		if (arg1 != null && this.aClass76_4.method2072() && (this.aClass67_Sub1_Sub1_5.aD3DCAPS1.VertexShaderVersion & 0xFFFF) >= 257) {
			this.anIDirect3DVertexShader2 = this.aClass67_Sub1_Sub1_5.anIDirect3DDevice1.a(arg1.method5076("transparent_water", "dx"));
		} else {
			this.anIDirect3DVertexShader2 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return this.anIDirect3DVertexShader2 != null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	@Override
	public void method9237() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(8) IDirect3DDevice local8 = this.aClass67_Sub1_Sub1_5.anIDirect3DDevice1;
		@Pc(13) Class181_Sub1 local13 = this.aClass67_Sub1_23.method5566();
		local13.method4925(Static331.aFloatArray52);
		Static331.aFloatArray52[1] *= 0.25F;
		Static331.aFloatArray52[7] *= 0.25F;
		Static331.aFloatArray52[2] *= 0.25F;
		Static331.aFloatArray52[3] *= 0.25F;
		Static331.aFloatArray52[4] *= 0.25F;
		Static331.aFloatArray52[5] *= 0.25F;
		Static331.aFloatArray52[6] *= 0.25F;
		Static331.aFloatArray52[0] *= 0.25F;
		local8.SetVertexShaderConstantF(8, Static331.aFloatArray52, 2);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		this.aClass67_Sub1_Sub1_5.method1925((IDirect3DVertexShader) null);
		this.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
		this.aClass67_Sub1_23.method5590(1, Static653.aClass58_4);
		this.aClass67_Sub1_23.method5590(2, Static472.aClass58_3);
		this.aClass67_Sub1_23.method5681(true);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
		this.aClass67_Sub1_23.method5686(Static477.aClass37_1, Static722.aClass37_5);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V")
	@Override
	public void method9243() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(7) IDirect3DDevice local7 = this.aClass67_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(12) Class181_Sub1 local12 = this.aClass67_Sub1_Sub1_5.method5578();
			local7.a(0, local12.method4920(Static331.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(17) IDirect3DDevice local17 = this.aClass67_Sub1_Sub1_5.anIDirect3DDevice1;
			@Pc(22) Class181_Sub1 local22 = this.aClass67_Sub1_Sub1_5.method5578();
			local17.a(0, local22.method4920(Static331.aFloatArray52));
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) IDirect3DDevice local3 = this.aClass67_Sub1_Sub1_5.anIDirect3DDevice1;
		if (this.aClass76_4.aBoolean190) {
			@Pc(25) float local25 = (float) (this.aClass67_Sub1_23.anInt6654 % 4000) / 4000.0F;
			this.aClass67_Sub1_23.method5612(this.aClass76_4.anInterface1_1);
			local3.a(11, local25, 0.0F, 0.0F, 0.0F);
		} else {
			@Pc(51) int local51 = this.aClass67_Sub1_23.anInt6654 % 4000 * 16 / 4000;
			this.aClass67_Sub1_23.method5612(this.aClass76_4.anInterface6Array2[local51]);
			local3.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		this.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
		this.aClass67_Sub1_23.method5590(1, Static472.aClass58_3);
		this.aClass67_Sub1_23.method5641(false, true, Static653.aClass58_4, 2);
		this.aClass67_Sub1_23.method5681(false);
		this.aClass67_Sub1_Sub1_5.method1925(this.anIDirect3DVertexShader2);
		this.method9235();
		this.method9237();
		this.method9233();
		this.method9240();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	@Override
	public void method9240() {
		if (this.anIDirect3DVertexShader2 == null) {
			return;
		}
		@Pc(6) IDirect3DDevice local6 = this.aClass67_Sub1_Sub1_5.anIDirect3DDevice1;
		if (this.aClass67_Sub1_23.anInt6676 > 0) {
			@Pc(15) float local15 = this.aClass67_Sub1_23.aFloat124;
			@Pc(19) float local19 = this.aClass67_Sub1_23.aFloat126;
			@Pc(23) float local23 = local19 - 512.0F;
			local6.a(10, local23, 1.0F / (local19 - local23), local19, 1.0F / (local15 - local19));
		} else {
			local6.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
		}
		this.aClass67_Sub1_23.method5588(this.aClass67_Sub1_23.anInt6669);
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
	@Override
	public void method9233() {
		if (this.anIDirect3DVertexShader2 != null) {
			@Pc(17) IDirect3DDevice local17 = this.aClass67_Sub1_Sub1_5.anIDirect3DDevice1;
			local17.a(4, this.aClass67_Sub1_23.method5632(Static331.aFloatArray52));
		}
	}
}
