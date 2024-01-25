import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Z")
	private boolean aBoolean158;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!pc;")
	private Class250 aClass250_1;

	@OriginalMember(owner = "client!de", name = "D", descriptor = "Lclient!pc;")
	private Class250 aClass250_4;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Lclient!pc;")
	private Class250 aClass250_2;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "Lclient!pc;")
	private Class250 aClass250_3;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Z")
	private final boolean aBoolean159;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "Lclient!dga;")
	private Class52_Sub1 aClass52_Sub1_3;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class7_Sub2(@OriginalArg(0) Class12_Sub1 arg0) {
		super(arg0);
		if (super.aClass12_Sub1_42.aBoolean32) {
			this.aClass250_1 = Static453.method6379(super.aClass12_Sub1_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass250_4 = Static453.method6379(super.aClass12_Sub1_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass250_2 = Static453.method6379(super.aClass12_Sub1_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass250_3 = Static453.method6379(super.aClass12_Sub1_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass250_3 != null & this.aClass250_1 != null & this.aClass250_4 != null & this.aClass250_2 != null) {
				this.aClass52_Sub1_3 = new Class52_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass52_Sub1_3.method1504(false, false);
				this.aBoolean159 = true;
			} else {
				this.aBoolean159 = false;
			}
		} else {
			this.aBoolean159 = false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7777(@OriginalArg(1) boolean arg0) {
		this.aBoolean160 = arg0;
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method378(this.aClass52_Sub1_3);
		super.aClass12_Sub1_42.method420(7681, 34165);
		super.aClass12_Sub1_42.method387(0, 768, 34166);
		super.aClass12_Sub1_42.method387(2, 770, 5890);
		super.aClass12_Sub1_42.method388(0, 34168);
		super.aClass12_Sub1_42.method376(0);
		this.method1738();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public void method1738() {
		@Pc(7) Class209_Sub3 local7 = super.aClass12_Sub1_42.aClass209_Sub3_4;
		if (this.aBoolean160) {
			OpenGL.glBindProgramARB(34336, ~super.aClass12_Sub1_42.anInt481 == Integer.MIN_VALUE ? this.aClass250_4.anInt6822 : this.aClass250_3.anInt6822);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass12_Sub1_42.anInt481 == Integer.MAX_VALUE ? this.aClass250_1.anInt6822 : this.aClass250_2.anInt6822);
		}
		local7.method5490((float) -1, (float) super.aClass12_Sub1_42.anInt481, 0.0F, 0.0F, Static440.aFloatArray56);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static440.aFloatArray56[0], Static440.aFloatArray56[1], Static440.aFloatArray56[2], Static440.aFloatArray56[3]);
		OpenGL.glEnable(34336);
		this.aBoolean158 = true;
		this.method1745();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	@Override
	public void method7785() {
		if (this.aBoolean158) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean158 = false;
		}
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method378(null);
		super.aClass12_Sub1_42.method420(8448, 8448);
		super.aClass12_Sub1_42.method387(0, 768, 5890);
		super.aClass12_Sub1_42.method387(2, 770, 34166);
		super.aClass12_Sub1_42.method388(0, 5890);
		super.aClass12_Sub1_42.method376(0);
		super.aClass12_Sub1_42.method387(0, 768, 5890);
		super.aClass12_Sub1_42.method388(0, 5890);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	@Override
	public void method7783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7780(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7784() {
		return this.aBoolean159;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public void method1745() {
		if (!this.aBoolean158) {
			return;
		}
		@Pc(6) int local6 = super.aClass12_Sub1_42.U();
		@Pc(10) int local10 = super.aClass12_Sub1_42.BA();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(34) float local34 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local34, local22, 1.0F / (float) super.aClass12_Sub1_42.anInt499, (float) super.aClass12_Sub1_42.anInt487 / 255.0F);
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method375(super.aClass12_Sub1_42.anInt489);
		super.aClass12_Sub1_42.method376(0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!vfa;B)V")
	@Override
	public void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
		if (arg1 == null) {
			super.aClass12_Sub1_42.method378(super.aClass12_Sub1_42.aClass52_Sub1_2);
			super.aClass12_Sub1_42.method401(1);
			super.aClass12_Sub1_42.method387(0, 768, 34168);
			super.aClass12_Sub1_42.method388(0, 34168);
		} else {
			super.aClass12_Sub1_42.method378(arg1);
			super.aClass12_Sub1_42.method401(arg0);
		}
	}
}
