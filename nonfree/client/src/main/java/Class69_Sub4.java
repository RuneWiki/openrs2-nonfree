import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class69_Sub4 extends Class69 {

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "Z")
	private boolean aBoolean261;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "Z")
	private boolean aBoolean262;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Z")
	private final boolean aBoolean263;

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "Lclient!v;")
	private Class371 aClass371_2;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "Lclient!v;")
	private Class371 aClass371_3;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!v;")
	private Class371 aClass371_1;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "Lclient!v;")
	private Class371 aClass371_4;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "Lclient!bp;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class69_Sub4(@OriginalArg(0) Class75_Sub3 arg0) {
		super(arg0);
		if (super.aClass75_Sub3_41.aBoolean486) {
			this.aClass371_2 = Static135.method2588("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass75_Sub3_41);
			this.aClass371_3 = Static135.method2588("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass75_Sub3_41);
			this.aClass371_1 = Static135.method2588("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass75_Sub3_41);
			this.aClass371_4 = Static135.method2588("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass75_Sub3_41);
			if (this.aClass371_4 != null & this.aClass371_1 != null & this.aClass371_2 != null & this.aClass371_3 != null) {
				this.aClass44_Sub1_1 = new Class44_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass44_Sub1_1.method3476(false, false);
				this.aBoolean263 = true;
			} else {
				this.aBoolean263 = false;
			}
		} else {
			this.aBoolean263 = false;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8635(@OriginalArg(0) boolean arg0) {
		this.aBoolean262 = arg0;
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5774(this.aClass44_Sub1_1);
		super.aClass75_Sub3_41.method5784(7681, 34165);
		super.aClass75_Sub3_41.method5825(768, 0, 34166);
		super.aClass75_Sub3_41.method5825(770, 2, 5890);
		super.aClass75_Sub3_41.method5806(0, 34168);
		super.aClass75_Sub3_41.method5775(0);
		this.method3131();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	@Override
	public void method8638() {
		if (this.aBoolean261) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean261 = false;
		}
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5774((Class44) null);
		super.aClass75_Sub3_41.method5784(8448, 8448);
		super.aClass75_Sub3_41.method5825(768, 0, 5890);
		super.aClass75_Sub3_41.method5825(770, 2, 34166);
		super.aClass75_Sub3_41.method5806(0, 5890);
		super.aClass75_Sub3_41.method5775(0);
		if (this.aBoolean260) {
			super.aClass75_Sub3_41.method5825(768, 0, 5890);
			super.aClass75_Sub3_41.method5806(0, 5890);
			this.aBoolean260 = false;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8637() {
		return this.aBoolean263;
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
	public void method3131() {
		@Pc(7) Class109_Sub2 local7 = super.aClass75_Sub3_41.aClass109_Sub2_4;
		if (this.aBoolean262) {
			OpenGL.glBindProgramARB(34336, super.aClass75_Sub3_41.lb == Integer.MAX_VALUE ? this.aClass371_3.anInt9907 : this.aClass371_4.anInt9907);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass75_Sub3_41.lb == Integer.MIN_VALUE ? this.aClass371_2.anInt9907 : this.aClass371_1.anInt9907);
		}
		local7.method3693(-1.0F, 0.0F, Static120.aFloatArray26, (float) super.aClass75_Sub3_41.lb, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static120.aFloatArray26[0], Static120.aFloatArray26[1], Static120.aFloatArray26[2], Static120.aFloatArray26[3]);
		OpenGL.glEnable(34336);
		this.aBoolean261 = true;
		this.method3132();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZLclient!ica;)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		if (arg1 != null) {
			if (this.aBoolean260) {
				super.aClass75_Sub3_41.method5825(768, 0, 5890);
				super.aClass75_Sub3_41.method5806(0, 5890);
				this.aBoolean260 = false;
			}
			super.aClass75_Sub3_41.method5774(arg1);
			super.aClass75_Sub3_41.method5787(arg0);
		} else if (!this.aBoolean260) {
			super.aClass75_Sub3_41.method5774(super.aClass75_Sub3_41.aClass44_Sub1_3);
			super.aClass75_Sub3_41.method5787(1);
			super.aClass75_Sub3_41.method5825(768, 0, 34168);
			super.aClass75_Sub3_41.method5806(0, 34168);
			this.aBoolean260 = true;
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	public void method3132() {
		if (!this.aBoolean261) {
			return;
		}
		@Pc(6) int local6 = super.aClass75_Sub3_41.XA();
		@Pc(10) int local10 = super.aClass75_Sub3_41.i();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass75_Sub3_41.anInt6573, (float) super.aClass75_Sub3_41.anInt6556 / 255.0F);
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5794(super.aClass75_Sub3_41.anInt6570);
		super.aClass75_Sub3_41.method5775(0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8632(@OriginalArg(0) boolean arg0) {
	}
}
