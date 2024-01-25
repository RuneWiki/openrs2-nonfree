import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class99_Sub6 extends Class99 {

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
	private boolean aBoolean602;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "Z")
	private boolean aBoolean603;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
	private boolean aBoolean600 = false;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "Lclient!jt;")
	private Class191 aClass191_3;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "Lclient!jt;")
	private Class191 aClass191_4;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!jt;")
	private Class191 aClass191_5;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "Lclient!jt;")
	private Class191 aClass191_2;

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Z")
	private final boolean aBoolean601;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "Lclient!bca;")
	private Class32_Sub1 aClass32_Sub1_6;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class99_Sub6(@OriginalArg(0) Class57_Sub2 arg0) {
		super(arg0);
		if (super.aClass57_Sub2_38.aBoolean224) {
			this.aClass191_3 = Static613.method8709("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass57_Sub2_38);
			this.aClass191_4 = Static613.method8709("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass57_Sub2_38);
			this.aClass191_5 = Static613.method8709("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass57_Sub2_38);
			this.aClass191_2 = Static613.method8709("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass57_Sub2_38);
			if (this.aClass191_5 != null & this.aClass191_4 != null & this.aClass191_3 != null & this.aClass191_2 != null) {
				this.aClass32_Sub1_6 = new Class32_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass32_Sub1_6.method2721(false, false);
				this.aBoolean601 = true;
			} else {
				this.aBoolean601 = false;
			}
		} else {
			this.aBoolean601 = false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	@Override
	public void method8726() {
		if (this.aBoolean602) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean602 = false;
		}
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2362((Class32) null);
		super.aClass57_Sub2_38.method2313(8448, 8448);
		super.aClass57_Sub2_38.method2368(5890, 0, 768);
		super.aClass57_Sub2_38.method2368(34166, 2, 770);
		super.aClass57_Sub2_38.method2312(5890, 0);
		super.aClass57_Sub2_38.method2345(0);
		if (this.aBoolean600) {
			super.aClass57_Sub2_38.method2368(5890, 0, 768);
			super.aClass57_Sub2_38.method2312(5890, 0);
			this.aBoolean600 = false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public void method6904() {
		if (!this.aBoolean602) {
			return;
		}
		@Pc(6) int local6 = super.aClass57_Sub2_38.XA();
		@Pc(10) int local10 = super.aClass57_Sub2_38.i();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass57_Sub2_38.anInt2788, (float) super.aClass57_Sub2_38.anInt2792 / 255.0F);
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2322(super.aClass57_Sub2_38.anInt2777);
		super.aClass57_Sub2_38.method2345(0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8718() {
		return this.aBoolean601;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	public void method6905() {
		@Pc(7) Class203_Sub2 local7 = super.aClass57_Sub2_38.aClass203_Sub2_4;
		if (this.aBoolean603) {
			OpenGL.glBindProgramARB(34336, super.aClass57_Sub2_38.anInt2786 == Integer.MAX_VALUE ? this.aClass191_4.anInt5064 : this.aClass191_2.anInt5064);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass57_Sub2_38.anInt2786 == Integer.MIN_VALUE ? this.aClass191_3.anInt5064 : this.aClass191_5.anInt5064);
		}
		local7.method6191(-1.0F, 0.0F, Static375.aFloatArray57, 0.0F, (float) super.aClass57_Sub2_38.anInt2786);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static375.aFloatArray57[0], Static375.aFloatArray57[1], Static375.aFloatArray57[2], Static375.aFloatArray57[3]);
		OpenGL.glEnable(34336);
		this.aBoolean602 = true;
		this.method6904();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLclient!mw;)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
		if (arg1 != null) {
			if (this.aBoolean600) {
				super.aClass57_Sub2_38.method2368(5890, 0, 768);
				super.aClass57_Sub2_38.method2312(5890, 0);
				this.aBoolean600 = false;
			}
			super.aClass57_Sub2_38.method2362(arg1);
			super.aClass57_Sub2_38.method2382(arg0);
		} else if (!this.aBoolean600) {
			super.aClass57_Sub2_38.method2362(super.aClass57_Sub2_38.aClass32_Sub1_2);
			super.aClass57_Sub2_38.method2382(1);
			super.aClass57_Sub2_38.method2368(34168, 0, 768);
			super.aClass57_Sub2_38.method2312(34168, 0);
			this.aBoolean600 = true;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8720(@OriginalArg(0) boolean arg0) {
		this.aBoolean603 = arg0;
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2362(this.aClass32_Sub1_6);
		super.aClass57_Sub2_38.method2313(7681, 34165);
		super.aClass57_Sub2_38.method2368(34166, 0, 768);
		super.aClass57_Sub2_38.method2368(5890, 2, 770);
		super.aClass57_Sub2_38.method2312(34168, 0);
		super.aClass57_Sub2_38.method2345(0);
		this.method6905();
	}
}
