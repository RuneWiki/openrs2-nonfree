import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class60_Sub4 extends Class60 {

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "Z")
	private boolean aBoolean501;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "Z")
	private boolean aBoolean502;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!kk;")
	private Class188 aClass188_2;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Lclient!kk;")
	private Class188 aClass188_1;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "Lclient!kk;")
	private Class188 aClass188_3;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "Lclient!kk;")
	private Class188 aClass188_4;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "Z")
	private final boolean aBoolean503;

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "Lclient!db;")
	private Class34_Sub2 aClass34_Sub2_2;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class60_Sub4(@OriginalArg(0) Class43_Sub3 arg0) {
		super(arg0);
		if (super.aClass43_Sub3_43.aBoolean670) {
			this.aClass188_2 = Static411.method5922("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass43_Sub3_43);
			this.aClass188_1 = Static411.method5922("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass43_Sub3_43);
			this.aClass188_3 = Static411.method5922("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass43_Sub3_43);
			this.aClass188_4 = Static411.method5922("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass43_Sub3_43);
			if (this.aClass188_4 != null & this.aClass188_2 != null & this.aClass188_1 != null & this.aClass188_3 != null) {
				this.aClass34_Sub2_2 = new Class34_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass34_Sub2_2.method1964(false, false);
				this.aBoolean503 = true;
			} else {
				this.aBoolean503 = false;
			}
		} else {
			this.aBoolean503 = false;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7735() {
		return this.aBoolean503;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
	public void method5319() {
		if (!this.aBoolean502) {
			return;
		}
		@Pc(18) int local18 = super.aClass43_Sub3_43.U();
		@Pc(22) int local22 = super.aClass43_Sub3_43.BA();
		@Pc(32) float local32 = (float) local18 - (float) (local18 - local22) * 0.125F;
		@Pc(44) float local44 = -((float) (local18 - local22) * 0.25F) + (float) local18;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, local32, 1.0F / (float) super.aClass43_Sub3_43.anInt8751, (float) super.aClass43_Sub3_43.anInt8749 / 255.0F);
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7233(super.aClass43_Sub3_43.anInt8747);
		super.aClass43_Sub3_43.method7277(0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7733(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
	public void method5321() {
		@Pc(7) Class109_Sub2 local7 = super.aClass43_Sub3_43.aClass109_Sub2_4;
		if (this.aBoolean501) {
			OpenGL.glBindProgramARB(34336, super.aClass43_Sub3_43.anInt8755 == Integer.MAX_VALUE ? this.aClass188_1.anInt5104 : this.aClass188_4.anInt5104);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass43_Sub3_43.anInt8755 == Integer.MAX_VALUE ? this.aClass188_2.anInt5104 : this.aClass188_3.anInt5104);
		}
		local7.method6776(Static356.aFloatArray49, 0.0F, 0.0F, (float) super.aClass43_Sub3_43.anInt8755, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static356.aFloatArray49[0], Static356.aFloatArray49[1], Static356.aFloatArray49[2], Static356.aFloatArray49[3]);
		OpenGL.glEnable(34336);
		this.aBoolean502 = true;
		this.method5319();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7730(@OriginalArg(0) boolean arg0) {
		this.aBoolean501 = arg0;
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7220(this.aClass34_Sub2_2);
		super.aClass43_Sub3_43.method7287(7681, 34165);
		super.aClass43_Sub3_43.method7225(0, 768, 34166);
		super.aClass43_Sub3_43.method7225(2, 770, 5890);
		super.aClass43_Sub3_43.method7282(34168, 0);
		super.aClass43_Sub3_43.method7277(0);
		this.method5321();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	@Override
	public void method7732() {
		if (this.aBoolean502) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean502 = false;
		}
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7220(null);
		super.aClass43_Sub3_43.method7287(8448, 8448);
		super.aClass43_Sub3_43.method7225(0, 768, 5890);
		super.aClass43_Sub3_43.method7225(2, 770, 34166);
		super.aClass43_Sub3_43.method7282(5890, 0);
		super.aClass43_Sub3_43.method7277(0);
		super.aClass43_Sub3_43.method7225(0, 768, 5890);
		super.aClass43_Sub3_43.method7282(5890, 0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLclient!um;)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		if (arg1 == null) {
			super.aClass43_Sub3_43.method7220(super.aClass43_Sub3_43.aClass34_Sub2_5);
			super.aClass43_Sub3_43.method7281(1);
			super.aClass43_Sub3_43.method7225(0, 768, 34168);
			super.aClass43_Sub3_43.method7282(34168, 0);
		} else {
			super.aClass43_Sub3_43.method7220(arg1);
			super.aClass43_Sub3_43.method7281(arg0);
		}
	}
}
