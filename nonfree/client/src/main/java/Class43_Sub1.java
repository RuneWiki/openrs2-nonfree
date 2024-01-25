import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "Z")
	private boolean aBoolean85;

	@OriginalMember(owner = "client!caa", name = "v", descriptor = "Z")
	private boolean aBoolean86;

	@OriginalMember(owner = "client!caa", name = "r", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!caa", name = "w", descriptor = "Lclient!nca;")
	private Class250 aClass250_1;

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "Lclient!nca;")
	private Class250 aClass250_4;

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "Lclient!nca;")
	private Class250 aClass250_3;

	@OriginalMember(owner = "client!caa", name = "z", descriptor = "Lclient!nca;")
	private Class250 aClass250_2;

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "Z")
	private final boolean aBoolean87;

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "Lclient!nw;")
	private Class245_Sub2 aClass245_Sub2_1;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class43_Sub1(@OriginalArg(0) Class67_Sub2 arg0) {
		super(arg0);
		if (super.aClass67_Sub2_41.aBoolean304) {
			this.aClass250_1 = Static392.method5907(super.aClass67_Sub2_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass250_4 = Static392.method5907(super.aClass67_Sub2_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass250_3 = Static392.method5907(super.aClass67_Sub2_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass250_2 = Static392.method5907(super.aClass67_Sub2_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass250_3 != null & this.aClass250_1 != null & this.aClass250_4 != null & this.aClass250_2 != null) {
				this.aClass245_Sub2_1 = new Class245_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass245_Sub2_1.method8473(false, false);
				this.aBoolean87 = true;
			} else {
				this.aBoolean87 = false;
			}
		} else {
			this.aBoolean87 = false;
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8859() {
		return this.aBoolean87;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	@Override
	public void method8866() {
		if (this.aBoolean86) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean86 = false;
		}
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3234((Class245) null);
		super.aClass67_Sub2_41.method3271(8448, 8448);
		super.aClass67_Sub2_41.method3279(5890, 768, 0);
		super.aClass67_Sub2_41.method3279(34166, 770, 2);
		super.aClass67_Sub2_41.method3269(5890, 0);
		super.aClass67_Sub2_41.method3268(0);
		if (this.aBoolean84) {
			super.aClass67_Sub2_41.method3279(5890, 768, 0);
			super.aClass67_Sub2_41.method3269(5890, 0);
			this.aBoolean84 = false;
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8858(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!sga;I)V")
	@Override
	public void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1) {
		if (arg1 != null) {
			if (this.aBoolean84) {
				super.aClass67_Sub2_41.method3279(5890, 768, 0);
				super.aClass67_Sub2_41.method3269(5890, 0);
				this.aBoolean84 = false;
			}
			super.aClass67_Sub2_41.method3234(arg1);
			super.aClass67_Sub2_41.method3255(arg0);
		} else if (!this.aBoolean84) {
			super.aClass67_Sub2_41.method3234(super.aClass67_Sub2_41.aClass245_Sub2_4);
			super.aClass67_Sub2_41.method3255(1);
			super.aClass67_Sub2_41.method3279(34168, 768, 0);
			super.aClass67_Sub2_41.method3269(34168, 0);
			this.aBoolean84 = true;
		}
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
	public void method843() {
		@Pc(7) Class181_Sub2 local7 = super.aClass67_Sub2_41.aClass181_Sub2_4;
		if (this.aBoolean85) {
			OpenGL.glBindProgramARB(34336, super.aClass67_Sub2_41.anInt3889 == Integer.MAX_VALUE ? this.aClass250_4.anInt7351 : this.aClass250_2.anInt7351);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass67_Sub2_41.anInt3889 == Integer.MAX_VALUE ? this.aClass250_1.anInt7351 : this.aClass250_3.anInt7351);
		}
		local7.method6177(Static562.aFloatArray96, 0.0F, -1.0F, (float) super.aClass67_Sub2_41.anInt3889, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static562.aFloatArray96[0], Static562.aFloatArray96[1], Static562.aFloatArray96[2], Static562.aFloatArray96[3]);
		OpenGL.glEnable(34336);
		this.aBoolean86 = true;
		this.method844();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)V")
	public void method844() {
		if (!this.aBoolean86) {
			return;
		}
		@Pc(11) int local11 = super.aClass67_Sub2_41.XA();
		@Pc(15) int local15 = super.aClass67_Sub2_41.i();
		@Pc(27) float local27 = -((float) (local11 - local15) * 0.125F) + (float) local11;
		@Pc(37) float local37 = (float) local11 - (float) (local11 - local15) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local27, 1.0F / (float) super.aClass67_Sub2_41.anInt3905, (float) super.aClass67_Sub2_41.anInt3917 / 255.0F);
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3247(super.aClass67_Sub2_41.anInt3896);
		super.aClass67_Sub2_41.method3268(0);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		this.aBoolean85 = arg0;
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3234(this.aClass245_Sub2_1);
		super.aClass67_Sub2_41.method3271(7681, 34165);
		super.aClass67_Sub2_41.method3279(34166, 768, 0);
		super.aClass67_Sub2_41.method3279(5890, 770, 2);
		super.aClass67_Sub2_41.method3269(34168, 0);
		super.aClass67_Sub2_41.method3268(0);
		this.method843();
	}
}
