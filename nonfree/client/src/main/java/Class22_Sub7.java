import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class22_Sub7 extends Class22 {

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "Z")
	private boolean aBoolean553;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!qv", name = "H", descriptor = "Z")
	private boolean aBoolean556 = false;

	@OriginalMember(owner = "client!qv", name = "C", descriptor = "Z")
	private final boolean aBoolean555;

	@OriginalMember(owner = "client!qv", name = "B", descriptor = "Lclient!ie;")
	private Class160 aClass160_4;

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "Lclient!ie;")
	private Class160 aClass160_5;

	@OriginalMember(owner = "client!qv", name = "r", descriptor = "Lclient!ie;")
	private Class160 aClass160_2;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "Lclient!ie;")
	private Class160 aClass160_3;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "Lclient!rba;")
	private Class10_Sub2 aClass10_Sub2_6;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class22_Sub7(@OriginalArg(0) Class95_Sub3 arg0) {
		super(arg0);
		if (super.aClass95_Sub3_37.aBoolean388) {
			this.aClass160_4 = Static384.method5389(super.aClass95_Sub3_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass160_5 = Static384.method5389(super.aClass95_Sub3_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass160_2 = Static384.method5389(super.aClass95_Sub3_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass160_3 = Static384.method5389(super.aClass95_Sub3_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass160_3 != null & this.aClass160_5 != null & this.aClass160_4 != null & this.aClass160_2 != null) {
				this.aClass10_Sub2_6 = new Class10_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass10_Sub2_6.method2859(false, false);
				this.aBoolean555 = true;
			} else {
				this.aBoolean555 = false;
			}
		} else {
			this.aBoolean555 = false;
		}
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
	public void method6595() {
		@Pc(7) Class17_Sub3 local7 = super.aClass95_Sub3_37.aClass17_Sub3_4;
		if (this.aBoolean553) {
			OpenGL.glBindProgramARB(34336, super.aClass95_Sub3_37.anInt5779 == Integer.MAX_VALUE ? this.aClass160_5.anInt4345 : this.aClass160_3.anInt4345);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass95_Sub3_37.anInt5779 == Integer.MAX_VALUE ? this.aClass160_4.anInt4345 : this.aClass160_2.anInt4345);
		}
		local7.method6244(0.0F, Static574.aFloatArray58, 0.0F, (float) super.aClass95_Sub3_37.anInt5779, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static574.aFloatArray58[0], Static574.aFloatArray58[1], Static574.aFloatArray58[2], Static574.aFloatArray58[3]);
		OpenGL.glEnable(34336);
		this.aBoolean554 = true;
		this.method6596();
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(B)V")
	public void method6596() {
		if (!this.aBoolean554) {
			return;
		}
		@Pc(10) int local10 = super.aClass95_Sub3_37.XA();
		@Pc(14) int local14 = super.aClass95_Sub3_37.i();
		@Pc(26) float local26 = -((float) (local10 - local14) * 0.125F) + (float) local10;
		@Pc(38) float local38 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local38, local26, 1.0F / (float) super.aClass95_Sub3_37.anInt5770, (float) super.aClass95_Sub3_37.anInt5787 / 255.0F);
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4893(super.aClass95_Sub3_37.anInt5765);
		super.aClass95_Sub3_37.method4900(0);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6984(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6978(@OriginalArg(0) boolean arg0) {
		this.aBoolean553 = arg0;
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4864(this.aClass10_Sub2_6);
		super.aClass95_Sub3_37.method4899(34165, 7681);
		super.aClass95_Sub3_37.method4869(34166, 0, 768);
		super.aClass95_Sub3_37.method4869(5890, 2, 770);
		super.aClass95_Sub3_37.method4850(0, 34168);
		super.aClass95_Sub3_37.method4900(0);
		this.method6595();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		if (this.aBoolean554) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean554 = false;
		}
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4864((Class10) null);
		super.aClass95_Sub3_37.method4899(8448, 8448);
		super.aClass95_Sub3_37.method4869(5890, 0, 768);
		super.aClass95_Sub3_37.method4869(34166, 2, 770);
		super.aClass95_Sub3_37.method4850(0, 5890);
		super.aClass95_Sub3_37.method4900(0);
		if (this.aBoolean556) {
			super.aClass95_Sub3_37.method4869(5890, 0, 768);
			super.aClass95_Sub3_37.method4850(0, 5890);
			this.aBoolean556 = false;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6982() {
		return this.aBoolean555;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)V")
	@Override
	public void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ru;II)V")
	@Override
	public void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean556) {
				super.aClass95_Sub3_37.method4869(5890, 0, 768);
				super.aClass95_Sub3_37.method4850(0, 5890);
				this.aBoolean556 = false;
			}
			super.aClass95_Sub3_37.method4864(arg0);
			super.aClass95_Sub3_37.method4870(arg1);
		} else if (!this.aBoolean556) {
			super.aClass95_Sub3_37.method4864(super.aClass95_Sub3_37.aClass10_Sub2_2);
			super.aClass95_Sub3_37.method4870(1);
			super.aClass95_Sub3_37.method4869(34168, 0, 768);
			super.aClass95_Sub3_37.method4850(0, 34168);
			this.aBoolean556 = true;
		}
	}
}
