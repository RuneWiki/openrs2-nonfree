import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class31_Sub5 extends Class31 {

	@OriginalMember(owner = "client!op", name = "n", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "Z")
	private boolean aBoolean592;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "Z")
	private boolean aBoolean591 = false;

	@OriginalMember(owner = "client!op", name = "A", descriptor = "Lclient!hu;")
	private Class154 aClass154_4;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "Lclient!hu;")
	private Class154 aClass154_3;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "Lclient!hu;")
	private Class154 aClass154_1;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "Lclient!hu;")
	private Class154 aClass154_2;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "Lclient!wi;")
	private Class50_Sub4 aClass50_Sub4_2;

	@OriginalMember(owner = "client!op", name = "C", descriptor = "Z")
	private final boolean aBoolean593;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class31_Sub5(@OriginalArg(0) Class101_Sub2 arg0) {
		super(arg0);
		if (super.aClass101_Sub2_43.aBoolean477) {
			this.aClass154_4 = Static611.method9195(super.aClass101_Sub2_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass154_3 = Static611.method9195(super.aClass101_Sub2_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass154_1 = Static611.method9195(super.aClass101_Sub2_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass154_2 = Static611.method9195(super.aClass101_Sub2_43, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass154_3 != null & this.aClass154_4 != null & this.aClass154_1 != null & this.aClass154_2 != null) {
				this.aClass50_Sub4_2 = new Class50_Sub4(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass50_Sub4_2.method9152(false, false);
				this.aBoolean593 = true;
			} else {
				this.aBoolean593 = false;
			}
		} else {
			this.aBoolean593 = false;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	@Override
	public void method9597() {
		if (this.aBoolean590) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean590 = false;
		}
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5690((Class50) null);
		super.aClass101_Sub2_43.method5665(8448, 8448);
		super.aClass101_Sub2_43.method5657(768, 0, 5890);
		super.aClass101_Sub2_43.method5657(770, 2, 34166);
		super.aClass101_Sub2_43.method5680(0, 5890);
		super.aClass101_Sub2_43.method5627(0);
		if (this.aBoolean591) {
			super.aClass101_Sub2_43.method5657(768, 0, 5890);
			super.aClass101_Sub2_43.method5680(0, 5890);
			this.aBoolean591 = false;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!fga;I)V")
	@Override
	public void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean591) {
				super.aClass101_Sub2_43.method5657(768, 0, 5890);
				super.aClass101_Sub2_43.method5680(0, 5890);
				this.aBoolean591 = false;
			}
			super.aClass101_Sub2_43.method5690(arg0);
			super.aClass101_Sub2_43.method5681(arg1);
		} else if (!this.aBoolean591) {
			super.aClass101_Sub2_43.method5690(super.aClass101_Sub2_43.aClass50_Sub4_1);
			super.aClass101_Sub2_43.method5681(1);
			super.aClass101_Sub2_43.method5657(768, 0, 34168);
			super.aClass101_Sub2_43.method5680(0, 34168);
			this.aBoolean591 = true;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9602(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9600(@OriginalArg(0) boolean arg0) {
		this.aBoolean592 = arg0;
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5690(this.aClass50_Sub4_2);
		super.aClass101_Sub2_43.method5665(34165, 7681);
		super.aClass101_Sub2_43.method5657(768, 0, 34166);
		super.aClass101_Sub2_43.method5657(770, 2, 5890);
		super.aClass101_Sub2_43.method5680(0, 34168);
		super.aClass101_Sub2_43.method5627(0);
		this.method7128();
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
	public void method7127() {
		if (!this.aBoolean590) {
			return;
		}
		@Pc(10) int local10 = super.aClass101_Sub2_43.XA();
		@Pc(14) int local14 = super.aClass101_Sub2_43.i();
		@Pc(26) float local26 = -((float) (local10 - local14) * 0.125F) + (float) local10;
		@Pc(37) float local37 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local26, 1.0F / (float) super.aClass101_Sub2_43.anInt6351, (float) super.aClass101_Sub2_43.anInt6343 / 255.0F);
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5649(super.aClass101_Sub2_43.anInt6335);
		super.aClass101_Sub2_43.method5627(0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
	public void method7128() {
		@Pc(7) Class76_Sub1 local7 = super.aClass101_Sub2_43.aClass76_Sub1_4;
		if (this.aBoolean592) {
			OpenGL.glBindProgramARB(34336, ~super.aClass101_Sub2_43.anInt6325 == Integer.MIN_VALUE ? this.aClass154_3.anInt4716 : this.aClass154_2.anInt4716);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass101_Sub2_43.anInt6325 == Integer.MIN_VALUE ? this.aClass154_4.anInt4716 : this.aClass154_1.anInt4716);
		}
		local7.method4556(0.0F, (float) super.aClass101_Sub2_43.anInt6325, Static203.aFloatArray24, -1.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static203.aFloatArray24[0], Static203.aFloatArray24[1], Static203.aFloatArray24[2], Static203.aFloatArray24[3]);
		OpenGL.glEnable(34336);
		this.aBoolean590 = true;
		this.method7127();
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9604() {
		return this.aBoolean593;
	}
}
