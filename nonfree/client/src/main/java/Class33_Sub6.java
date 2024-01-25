import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class33_Sub6 extends Class33 {

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "Z")
	private boolean aBoolean552;

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "Z")
	private boolean aBoolean555 = false;

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "Lclient!nk;")
	private Class248 aClass248_5;

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Lclient!nk;")
	private Class248 aClass248_2;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "Lclient!nk;")
	private Class248 aClass248_4;

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "Lclient!nk;")
	private Class248 aClass248_3;

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "Z")
	private final boolean aBoolean553;

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "Lclient!km;")
	private Class66_Sub1 aClass66_Sub1_4;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class33_Sub6(@OriginalArg(0) Class137_Sub3 arg0) {
		super(arg0);
		if (super.aClass137_Sub3_42.aBoolean606) {
			this.aClass248_5 = Static512.method7462(super.aClass137_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass248_2 = Static512.method7462(super.aClass137_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass248_4 = Static512.method7462(super.aClass137_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass248_3 = Static512.method7462(super.aClass137_Sub3_42, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass248_3 != null & this.aClass248_2 != null & this.aClass248_5 != null & this.aClass248_4 != null) {
				this.aClass66_Sub1_4 = new Class66_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass66_Sub1_4.method1669(false, false);
				this.aBoolean553 = true;
			} else {
				this.aBoolean553 = false;
			}
		} else {
			this.aBoolean553 = false;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8854(@OriginalArg(0) boolean arg0) {
		this.aBoolean552 = arg0;
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7090(this.aClass66_Sub1_4);
		super.aClass137_Sub3_42.method7084(7681, 34165);
		super.aClass137_Sub3_42.method7071(34166, 768, 0);
		super.aClass137_Sub3_42.method7071(5890, 770, 2);
		super.aClass137_Sub3_42.method7027(34168, 0);
		super.aClass137_Sub3_42.method7095(0);
		this.method6607();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8846() {
		return this.aBoolean553;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	public void method6607() {
		@Pc(7) Class26_Sub3 local7 = super.aClass137_Sub3_42.aClass26_Sub3_4;
		if (this.aBoolean552) {
			OpenGL.glBindProgramARB(34336, ~super.aClass137_Sub3_42.anInt8567 == Integer.MIN_VALUE ? this.aClass248_2.anInt7377 : this.aClass248_3.anInt7377);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass137_Sub3_42.anInt8567 == Integer.MAX_VALUE ? this.aClass248_5.anInt7377 : this.aClass248_4.anInt7377);
		}
		local7.method6464((float) super.aClass137_Sub3_42.anInt8567, 0.0F, 0.0F, -1.0F, Static630.aFloatArray85);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static630.aFloatArray85[0], Static630.aFloatArray85[1], Static630.aFloatArray85[2], Static630.aFloatArray85[3]);
		OpenGL.glEnable(34336);
		this.aBoolean554 = true;
		this.method6608();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8847(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	public void method6608() {
		if (!this.aBoolean554) {
			return;
		}
		@Pc(6) int local6 = super.aClass137_Sub3_42.XA();
		@Pc(10) int local10 = super.aClass137_Sub3_42.i();
		@Pc(21) float local21 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(31) float local31 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local31, local21, 1.0F / (float) super.aClass137_Sub3_42.anInt8570, (float) super.aClass137_Sub3_42.anInt8579 / 255.0F);
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7070(super.aClass137_Sub3_42.anInt8571);
		super.aClass137_Sub3_42.method7095(0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)V")
	@Override
	public void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZLclient!dca;)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		if (arg1 != null) {
			if (this.aBoolean555) {
				super.aClass137_Sub3_42.method7071(5890, 768, 0);
				super.aClass137_Sub3_42.method7027(5890, 0);
				this.aBoolean555 = false;
			}
			super.aClass137_Sub3_42.method7090(arg1);
			super.aClass137_Sub3_42.method7077(arg0);
		} else if (!this.aBoolean555) {
			super.aClass137_Sub3_42.method7090(super.aClass137_Sub3_42.aClass66_Sub1_6);
			super.aClass137_Sub3_42.method7077(1);
			super.aClass137_Sub3_42.method7071(34168, 768, 0);
			super.aClass137_Sub3_42.method7027(34168, 0);
			this.aBoolean555 = true;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	@Override
	public void method8848() {
		if (this.aBoolean554) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean554 = false;
		}
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7090((Class66) null);
		super.aClass137_Sub3_42.method7084(8448, 8448);
		super.aClass137_Sub3_42.method7071(5890, 768, 0);
		super.aClass137_Sub3_42.method7071(34166, 770, 2);
		super.aClass137_Sub3_42.method7027(5890, 0);
		super.aClass137_Sub3_42.method7095(0);
		if (this.aBoolean555) {
			super.aClass137_Sub3_42.method7071(5890, 768, 0);
			super.aClass137_Sub3_42.method7027(5890, 0);
			this.aBoolean555 = false;
		}
	}
}
