import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class20_Sub8 extends Class20 {

	@OriginalMember(owner = "client!sda", name = "l", descriptor = "Z")
	private boolean aBoolean614;

	@OriginalMember(owner = "client!sda", name = "p", descriptor = "Z")
	private boolean aBoolean616;

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "Z")
	private final boolean aBoolean615;

	@OriginalMember(owner = "client!sda", name = "q", descriptor = "Lclient!qb;")
	private Class267 aClass267_3;

	@OriginalMember(owner = "client!sda", name = "u", descriptor = "Lclient!qb;")
	private Class267 aClass267_5;

	@OriginalMember(owner = "client!sda", name = "m", descriptor = "Lclient!qb;")
	private Class267 aClass267_2;

	@OriginalMember(owner = "client!sda", name = "s", descriptor = "Lclient!qb;")
	private Class267 aClass267_4;

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "Lclient!saa;")
	private Class77_Sub1 aClass77_Sub1_4;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class20_Sub8(@OriginalArg(0) Class44_Sub3 arg0) {
		super(arg0);
		if (super.aClass44_Sub3_42.aBoolean401) {
			this.aClass267_3 = Static295.method8182("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass44_Sub3_42);
			this.aClass267_5 = Static295.method8182("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass44_Sub3_42);
			this.aClass267_2 = Static295.method8182("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass44_Sub3_42);
			this.aClass267_4 = Static295.method8182("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass44_Sub3_42);
			if (this.aClass267_4 != null & this.aClass267_2 != null & this.aClass267_5 != null & this.aClass267_3 != null) {
				this.aClass77_Sub1_4 = new Class77_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass77_Sub1_4.method2266(false, false);
				this.aBoolean615 = true;
			} else {
				this.aBoolean615 = false;
			}
		} else {
			this.aBoolean615 = false;
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7868() {
		return this.aBoolean615;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)V")
	public void method7115() {
		@Pc(15) Class8_Sub2 local15 = super.aClass44_Sub3_42.aClass8_Sub2_4;
		if (this.aBoolean614) {
			OpenGL.glBindProgramARB(34336, super.aClass44_Sub3_42.anInt5513 == Integer.MAX_VALUE ? this.aClass267_5.anInt7827 : this.aClass267_4.anInt7827);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass44_Sub3_42.anInt5513 == Integer.MIN_VALUE ? this.aClass267_3.anInt7827 : this.aClass267_2.anInt7827);
		}
		local15.method934(-1.0F, 0.0F, Static207.aFloatArray25, (float) super.aClass44_Sub3_42.anInt5513, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static207.aFloatArray25[0], Static207.aFloatArray25[1], Static207.aFloatArray25[2], Static207.aFloatArray25[3]);
		OpenGL.glEnable(34336);
		this.aBoolean616 = true;
		this.method7116();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)V")
	@Override
	public void method7867() {
		if (this.aBoolean616) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean616 = false;
		}
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4605(null);
		super.aClass44_Sub3_42.method4621(8448, 8448);
		super.aClass44_Sub3_42.method4641(768, 0, 5890);
		super.aClass44_Sub3_42.method4641(770, 2, 34166);
		super.aClass44_Sub3_42.method4611(5890, 0);
		super.aClass44_Sub3_42.method4648(0);
		super.aClass44_Sub3_42.method4641(768, 0, 5890);
		super.aClass44_Sub3_42.method4611(5890, 0);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7870(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "(B)V")
	public void method7116() {
		if (!this.aBoolean616) {
			return;
		}
		@Pc(6) int local6 = super.aClass44_Sub3_42.U();
		@Pc(10) int local10 = super.aClass44_Sub3_42.BA();
		@Pc(21) float local21 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(33) float local33 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local33, local21, 1.0F / (float) super.aClass44_Sub3_42.anInt5490, (float) super.aClass44_Sub3_42.anInt5508 / 255.0F);
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4670(super.aClass44_Sub3_42.anInt5487);
		super.aClass44_Sub3_42.method4648(0);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7862(@OriginalArg(0) boolean arg0) {
		this.aBoolean614 = arg0;
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4605(this.aClass77_Sub1_4);
		super.aClass44_Sub3_42.method4621(34165, 7681);
		super.aClass44_Sub3_42.method4641(768, 0, 34166);
		super.aClass44_Sub3_42.method4641(770, 2, 5890);
		super.aClass44_Sub3_42.method4611(34168, 0);
		super.aClass44_Sub3_42.method4648(0);
		this.method7115();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!jf;II)V")
	@Override
	public void method7863(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			super.aClass44_Sub3_42.method4605(super.aClass44_Sub3_42.aClass77_Sub1_2);
			super.aClass44_Sub3_42.method4658(1);
			super.aClass44_Sub3_42.method4641(768, 0, 34168);
			super.aClass44_Sub3_42.method4611(34168, 0);
		} else {
			super.aClass44_Sub3_42.method4605(arg0);
			super.aClass44_Sub3_42.method4658(arg1);
		}
	}
}
