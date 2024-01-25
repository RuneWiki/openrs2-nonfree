import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!an", name = "o", descriptor = "Z")
	private boolean aBoolean17;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "Z")
	private boolean aBoolean18;

	@OriginalMember(owner = "client!an", name = "e", descriptor = "Z")
	private boolean aBoolean16 = false;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Lclient!pl;")
	private Class264 aClass264_2;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "Lclient!pl;")
	private Class264 aClass264_3;

	@OriginalMember(owner = "client!an", name = "u", descriptor = "Lclient!pl;")
	private Class264 aClass264_4;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Lclient!pl;")
	private Class264 aClass264_1;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "Z")
	private final boolean aBoolean19;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Lclient!tp;")
	private Class85_Sub1 aClass85_Sub1_1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class19_Sub1(@OriginalArg(0) Class20_Sub3 arg0) {
		super(arg0);
		if (super.aClass20_Sub3_42.aBoolean630) {
			this.aClass264_2 = Static250.method6312(super.aClass20_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass264_3 = Static250.method6312(super.aClass20_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass264_4 = Static250.method6312(super.aClass20_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass264_1 = Static250.method6312(super.aClass20_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass264_1 != null & this.aClass264_2 != null & this.aClass264_3 != null & this.aClass264_4 != null) {
				this.aClass85_Sub1_1 = new Class85_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass85_Sub1_1.method2893(false, false);
				this.aBoolean19 = true;
			} else {
				this.aBoolean19 = false;
			}
		} else {
			this.aBoolean19 = false;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	public void method387() {
		@Pc(11) Class30_Sub3 local11 = super.aClass20_Sub3_42.aClass30_Sub3_4;
		if (this.aBoolean18) {
			OpenGL.glBindProgramARB(34336, ~super.aClass20_Sub3_42.anInt8790 == Integer.MIN_VALUE ? this.aClass264_3.anInt8064 : this.aClass264_1.anInt8064);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass20_Sub3_42.anInt8790 == Integer.MAX_VALUE ? this.aClass264_2.anInt8064 : this.aClass264_4.anInt8064);
		}
		local11.method4390(0.0F, 0.0F, -1.0F, (float) super.aClass20_Sub3_42.anInt8790, Static326.aFloatArray56);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static326.aFloatArray56[0], Static326.aFloatArray56[1], Static326.aFloatArray56[2], Static326.aFloatArray56[3]);
		OpenGL.glEnable(34336);
		this.aBoolean17 = true;
		this.method389();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9167(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9165() {
		return this.aBoolean19;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9162(@OriginalArg(0) boolean arg0) {
		this.aBoolean18 = arg0;
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7358(this.aClass85_Sub1_1);
		super.aClass20_Sub3_42.method7316(34165, 7681);
		super.aClass20_Sub3_42.method7349(34166, 768, 0);
		super.aClass20_Sub3_42.method7349(5890, 770, 2);
		super.aClass20_Sub3_42.method7362(0, 34168);
		super.aClass20_Sub3_42.method7325(0);
		this.method387();
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V")
	public void method389() {
		if (!this.aBoolean17) {
			return;
		}
		@Pc(10) int local10 = super.aClass20_Sub3_42.XA();
		@Pc(14) int local14 = super.aClass20_Sub3_42.i();
		@Pc(25) float local25 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(35) float local35 = (float) local10 - (float) (local10 - local14) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local35, local25, 1.0F / (float) super.aClass20_Sub3_42.anInt8807, (float) super.aClass20_Sub3_42.anInt8799 / 255.0F);
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7395(super.aClass20_Sub3_42.anInt8797);
		super.aClass20_Sub3_42.method7325(0);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	@Override
	public void method9161() {
		if (this.aBoolean17) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean17 = false;
		}
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7358(null);
		super.aClass20_Sub3_42.method7316(8448, 8448);
		super.aClass20_Sub3_42.method7349(5890, 768, 0);
		super.aClass20_Sub3_42.method7349(34166, 770, 2);
		super.aClass20_Sub3_42.method7362(0, 5890);
		super.aClass20_Sub3_42.method7325(0);
		if (this.aBoolean16) {
			super.aClass20_Sub3_42.method7349(5890, 768, 0);
			super.aClass20_Sub3_42.method7362(0, 5890);
			this.aBoolean16 = false;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ud;BI)V")
	@Override
	public void method9168(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean16) {
				super.aClass20_Sub3_42.method7349(5890, 768, 0);
				super.aClass20_Sub3_42.method7362(0, 5890);
				this.aBoolean16 = false;
			}
			super.aClass20_Sub3_42.method7358(arg0);
			super.aClass20_Sub3_42.method7348(arg1);
		} else if (!this.aBoolean16) {
			super.aClass20_Sub3_42.method7358(super.aClass20_Sub3_42.aClass85_Sub1_3);
			super.aClass20_Sub3_42.method7348(1);
			super.aClass20_Sub3_42.method7349(34168, 768, 0);
			super.aClass20_Sub3_42.method7362(0, 34168);
			this.aBoolean16 = true;
		}
	}
}
