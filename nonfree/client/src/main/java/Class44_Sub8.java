import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class44_Sub8 extends Class44 {

	@OriginalMember(owner = "client!sja", name = "d", descriptor = "Z")
	private boolean aBoolean657;

	@OriginalMember(owner = "client!sja", name = "t", descriptor = "Z")
	private boolean aBoolean660;

	@OriginalMember(owner = "client!sja", name = "s", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!sja", name = "e", descriptor = "Lclient!vea;")
	private Class372 aClass372_2;

	@OriginalMember(owner = "client!sja", name = "j", descriptor = "Lclient!vea;")
	private Class372 aClass372_4;

	@OriginalMember(owner = "client!sja", name = "k", descriptor = "Lclient!vea;")
	private Class372 aClass372_5;

	@OriginalMember(owner = "client!sja", name = "g", descriptor = "Lclient!vea;")
	private Class372 aClass372_3;

	@OriginalMember(owner = "client!sja", name = "q", descriptor = "Z")
	private final boolean aBoolean658;

	@OriginalMember(owner = "client!sja", name = "f", descriptor = "Lclient!ld;")
	private Class116_Sub2 aClass116_Sub2_6;

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class44_Sub8(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
		if (super.aClass33_Sub3_34.aBoolean565) {
			this.aClass372_2 = Static355.method4754("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass33_Sub3_34);
			this.aClass372_4 = Static355.method4754("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass33_Sub3_34);
			this.aClass372_5 = Static355.method4754("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass33_Sub3_34);
			this.aClass372_3 = Static355.method4754("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass33_Sub3_34);
			if (this.aClass372_3 != null & this.aClass372_4 != null & this.aClass372_2 != null & this.aClass372_5 != null) {
				this.aClass116_Sub2_6 = new Class116_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass116_Sub2_6.method6838(false, false);
				this.aBoolean658 = true;
			} else {
				this.aBoolean658 = false;
			}
		} else {
			this.aBoolean658 = false;
		}
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7670(@OriginalArg(1) boolean arg0) {
		this.aBoolean657 = arg0;
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6340(this.aClass116_Sub2_6);
		super.aClass33_Sub3_34.method6365(7681, 34165);
		super.aClass33_Sub3_34.method6307(34166, 0, 768);
		super.aClass33_Sub3_34.method6307(5890, 2, 770);
		super.aClass33_Sub3_34.method6335(0, 34168);
		super.aClass33_Sub3_34.method6329(0);
		this.method7326();
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)V")
	public void method7326() {
		@Pc(7) Class92_Sub2 local7 = super.aClass33_Sub3_34.aClass92_Sub2_4;
		if (this.aBoolean657) {
			OpenGL.glBindProgramARB(34336, ~super.aClass33_Sub3_34.anInt7288 == Integer.MIN_VALUE ? this.aClass372_4.anInt9862 : this.aClass372_3.anInt9862);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass33_Sub3_34.anInt7288 == Integer.MAX_VALUE ? this.aClass372_2.anInt9862 : this.aClass372_5.anInt9862);
		}
		local7.method3222((float) super.aClass33_Sub3_34.anInt7288, -1.0F, 0.0F, 0.0F, Static89.aFloatArray4);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static89.aFloatArray4[0], Static89.aFloatArray4[1], Static89.aFloatArray4[2], Static89.aFloatArray4[3]);
		OpenGL.glEnable(34336);
		this.aBoolean660 = true;
		this.method7328();
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7666() {
		return this.aBoolean658;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(IBLclient!fha;)V")
	@Override
	public void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1) {
		if (arg1 != null) {
			if (this.aBoolean659) {
				super.aClass33_Sub3_34.method6307(5890, 0, 768);
				super.aClass33_Sub3_34.method6335(0, 5890);
				this.aBoolean659 = false;
			}
			super.aClass33_Sub3_34.method6340(arg1);
			super.aClass33_Sub3_34.method6336(arg0);
		} else if (!this.aBoolean659) {
			super.aClass33_Sub3_34.method6340(super.aClass33_Sub3_34.aClass116_Sub2_5);
			super.aClass33_Sub3_34.method6336(1);
			super.aClass33_Sub3_34.method6307(34168, 0, 768);
			super.aClass33_Sub3_34.method6335(0, 34168);
			this.aBoolean659 = true;
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V")
	@Override
	public void method7672() {
		if (this.aBoolean660) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean660 = false;
		}
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6340((Class116) null);
		super.aClass33_Sub3_34.method6365(8448, 8448);
		super.aClass33_Sub3_34.method6307(5890, 0, 768);
		super.aClass33_Sub3_34.method6307(34166, 2, 770);
		super.aClass33_Sub3_34.method6335(0, 5890);
		super.aClass33_Sub3_34.method6329(0);
		if (this.aBoolean659) {
			super.aClass33_Sub3_34.method6307(5890, 0, 768);
			super.aClass33_Sub3_34.method6335(0, 5890);
			this.aBoolean659 = false;
		}
	}

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "(I)V")
	public void method7328() {
		if (!this.aBoolean660) {
			return;
		}
		@Pc(14) int local14 = super.aClass33_Sub3_34.XA();
		@Pc(18) int local18 = super.aClass33_Sub3_34.i();
		@Pc(28) float local28 = (float) local14 - (float) (local14 - local18) * 0.125F;
		@Pc(40) float local40 = -((float) (local14 - local18) * 0.25F) + (float) local14;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local40, local28, 1.0F / (float) super.aClass33_Sub3_34.anInt7294, (float) super.aClass33_Sub3_34.anInt7290 / 255.0F);
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6357(super.aClass33_Sub3_34.anInt7303);
		super.aClass33_Sub3_34.method6329(0);
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(III)V")
	@Override
	public void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "(IZ)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0) {
	}
}
