import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "Z")
	private boolean aBoolean378;

	@OriginalMember(owner = "client!lfa", name = "z", descriptor = "Z")
	private boolean aBoolean381;

	@OriginalMember(owner = "client!lfa", name = "y", descriptor = "Z")
	private boolean aBoolean380 = false;

	@OriginalMember(owner = "client!lfa", name = "r", descriptor = "Lclient!cca;")
	private Class48 aClass48_4;

	@OriginalMember(owner = "client!lfa", name = "p", descriptor = "Lclient!cca;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "Lclient!cca;")
	private Class48 aClass48_2;

	@OriginalMember(owner = "client!lfa", name = "s", descriptor = "Lclient!cca;")
	private Class48 aClass48_5;

	@OriginalMember(owner = "client!lfa", name = "u", descriptor = "Lclient!rq;")
	private Class53_Sub2 aClass53_Sub2_4;

	@OriginalMember(owner = "client!lfa", name = "k", descriptor = "Z")
	private final boolean aBoolean379;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class11_Sub5(@OriginalArg(0) Class132_Sub3 arg0) {
		super(arg0);
		if (super.aClass132_Sub3_43.aBoolean540) {
			this.aClass48_4 = Static433.method6408("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass132_Sub3_43);
			this.aClass48_3 = Static433.method6408("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass132_Sub3_43);
			this.aClass48_2 = Static433.method6408("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass132_Sub3_43);
			this.aClass48_5 = Static433.method6408("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass132_Sub3_43);
			if (this.aClass48_5 != null & this.aClass48_2 != null & this.aClass48_3 != null & this.aClass48_4 != null) {
				this.aClass53_Sub2_4 = new Class53_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass53_Sub2_4.method3730(false, false);
				this.aBoolean379 = true;
			} else {
				this.aBoolean379 = false;
			}
		} else {
			this.aBoolean379 = false;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8989(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8991() {
		return this.aBoolean379;
	}

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "(I)V")
	public void method4911() {
		@Pc(7) Class207_Sub1 local7 = super.aClass132_Sub3_43.aClass207_Sub1_4;
		if (this.aBoolean378) {
			OpenGL.glBindProgramARB(34336, super.aClass132_Sub3_43.anInt7898 == Integer.MAX_VALUE ? this.aClass48_3.anInt1211 : this.aClass48_5.anInt1211);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass132_Sub3_43.anInt7898 == Integer.MIN_VALUE ? this.aClass48_4.anInt1211 : this.aClass48_2.anInt1211);
		}
		local7.method5002((float) super.aClass132_Sub3_43.anInt7898, 0.0F, (float) 0, -1.0F, Static578.aFloatArray72);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static578.aFloatArray72[0], Static578.aFloatArray72[1], Static578.aFloatArray72[2], Static578.aFloatArray72[3]);
		OpenGL.glEnable(34336);
		this.aBoolean381 = true;
		this.method4912();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8982() {
		if (this.aBoolean381) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean381 = false;
		}
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6759((Class53) null);
		super.aClass132_Sub3_43.method6770(8448, 8448);
		super.aClass132_Sub3_43.method6763(0, 768, 5890);
		super.aClass132_Sub3_43.method6763(2, 770, 34166);
		super.aClass132_Sub3_43.method6760(5890, 0);
		super.aClass132_Sub3_43.method6802(0);
		if (this.aBoolean380) {
			super.aClass132_Sub3_43.method6763(0, 768, 5890);
			super.aClass132_Sub3_43.method6760(5890, 0);
			this.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "(I)V")
	public void method4912() {
		if (!this.aBoolean381) {
			return;
		}
		@Pc(6) int local6 = super.aClass132_Sub3_43.XA();
		@Pc(10) int local10 = super.aClass132_Sub3_43.i();
		@Pc(21) float local21 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(33) float local33 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local33, local21, 1.0F / (float) super.aClass132_Sub3_43.anInt7915, (float) super.aClass132_Sub3_43.anInt7911 / 255.0F);
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6733(super.aClass132_Sub3_43.anInt7923);
		super.aClass132_Sub3_43.method6802(0);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8984(@OriginalArg(1) boolean arg0) {
		this.aBoolean378 = arg0;
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6759(this.aClass53_Sub2_4);
		super.aClass132_Sub3_43.method6770(7681, 34165);
		super.aClass132_Sub3_43.method6763(0, 768, 34166);
		super.aClass132_Sub3_43.method6763(2, 770, 5890);
		super.aClass132_Sub3_43.method6760(34168, 0);
		super.aClass132_Sub3_43.method6802(0);
		this.method4911();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZLclient!wha;)V")
	@Override
	public void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		if (arg1 != null) {
			if (this.aBoolean380) {
				super.aClass132_Sub3_43.method6763(0, 768, 5890);
				super.aClass132_Sub3_43.method6760(5890, 0);
				this.aBoolean380 = false;
			}
			super.aClass132_Sub3_43.method6759(arg1);
			super.aClass132_Sub3_43.method6803(arg0);
		} else if (!this.aBoolean380) {
			super.aClass132_Sub3_43.method6759(super.aClass132_Sub3_43.aClass53_Sub2_6);
			super.aClass132_Sub3_43.method6803(1);
			super.aClass132_Sub3_43.method6763(0, 768, 34168);
			super.aClass132_Sub3_43.method6760(34168, 0);
			this.aBoolean380 = true;
		}
	}
}
